package ru.geekbrains.geoweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ru.geekbrains.geoweather.controller.WeatherManager;
import ru.geekbrains.geoweather.model.WeatherResponse;

public class MainActivity extends AppCompatActivity {
    private static final String OMSK = "294463";
    private static final String API_KEY = "POd2yTXgNmeTxCy1rOPd0hsD5nclsF9G";
    private static final String LANGUAGE = "ru-ru";
    private static final String DETAILS = "false";

    TextView bigTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bigTemp = findViewById(R.id.bigTemp);

        initWeather();
    }

    private void initWeather() {
        WeatherManager weatherManager = new WeatherManager();
        weatherManager.initRetrofit();
        weatherManager.getAccuWeather().loadWeather(OMSK, API_KEY, LANGUAGE, DETAILS).enqueue(new Callback<List<WeatherResponse>>() {
            @Override
            public void onResponse(Call<List<WeatherResponse>> call, Response<List<WeatherResponse>> response) {
                String result = String.valueOf(response.body().get(0).getTemperature().getMetric().getValue());
                bigTemp.setText(result + "C");
            }

            @Override
            public void onFailure(Call<List<WeatherResponse>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
