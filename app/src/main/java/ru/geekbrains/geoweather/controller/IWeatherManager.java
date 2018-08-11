package ru.geekbrains.geoweather.controller;

public interface IWeatherManager {
    void initRetrofit();

    void requestRetrofit(String locationKey, String ApiKey, String language, String details);
}
