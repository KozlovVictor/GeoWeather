package ru.geekbrains.geoweather.controller;

import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.geekbrains.geoweather.AccuWeather;
import ru.geekbrains.geoweather.model.WeatherResponse;

public class WeatherManager implements IWeatherManager {

    private static final String BASE_URL = "http://dataservice.accuweather.com";
    AccuWeather accuWeather;

    @Override
    public void initRetrofit() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        Gson gson = gsonBuilder.create();
//        WeatherResponse[] listWeatherResponce = gson.fromJson("", WeatherResponse[].class);


        String targetUrl = BASE_URL;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(targetUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        accuWeather = retrofit.create(AccuWeather.class);
    }

    @Override
    public void requestRetrofit(String locationKey, String ApiKey, String language, String details) {
        accuWeather.loadWeather(locationKey, ApiKey, language, details).enqueue(new Callback<List<WeatherResponse>>() {
            @Override
            public void onResponse(Call<List<WeatherResponse>> call, Response<List<WeatherResponse>> response) {
                String result = response.body().get(0).getWeatherIcon().toString();
//                Log.d("temp", result);
            }

            @Override
            public void onFailure(Call<List<WeatherResponse>> call, Throwable t) {
//                Log.d("temp", t.toString());
            }
        });
    }
}