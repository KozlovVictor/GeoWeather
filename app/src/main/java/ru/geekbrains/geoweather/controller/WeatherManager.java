package ru.geekbrains.geoweather.controller;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.geekbrains.geoweather.GetWeather;

public class WeatherManager {

    private static final String BASE_URL = "http://dataservice.accuweather.com";
    GetWeather accuWeather;

    public void initRetrofit() {

        String targetUrl = BASE_URL;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(targetUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        accuWeather = retrofit.create(GetWeather.class);
    }

    public GetWeather getAccuWeather() {
        return accuWeather;
    }
}