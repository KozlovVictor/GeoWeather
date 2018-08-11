package ru.geekbrains.geoweather.controller;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.geekbrains.geoweather.AccuWeather;
import ru.geekbrains.geoweather.model.Response;

public class WeatherManager implements IWeatherManager {

    String location;

    public WeatherManager(String location) {
        this.location = location;
    }

    private static final String BASE_URL = "http://dataservice.accuweather.com/currentconditions/v1/";
    AccuWeather accuWeather;

    @Override
    public void initRetrofit() {
        String targetUrl = BASE_URL + location;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(targetUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        accuWeather = retrofit.create(AccuWeather.class);
    }

    @Override
    public void requestRetrofit(String ApiKey, String language, String details) {
        accuWeather.loadWeather(ApiKey, language, details).enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }
}
