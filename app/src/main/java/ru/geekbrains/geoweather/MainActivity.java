package ru.geekbrains.geoweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ru.geekbrains.geoweather.controller.WeatherManager;

public class MainActivity extends AppCompatActivity {
    private final String OMSK = "294463";
    private final String API_KEY = "POd2yTXgNmeTxCy1rOPd0hsD5nclsF9G";
    private final String LANGUAGE = "ru-ru";
    private final String DETAILS = "false";

    TextView bigTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bigTemp = findViewById(R.id.bigTemp);

//        294463 Omsk
        initWeather();
    }

    private void initWeather() {
        WeatherManager weatherManager = new WeatherManager();
        weatherManager.initRetrofit();
        weatherManager.requestRetrofit(OMSK, API_KEY, LANGUAGE, DETAILS);
    }
}
