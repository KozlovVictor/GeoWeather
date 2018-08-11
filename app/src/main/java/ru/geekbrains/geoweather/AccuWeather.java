package ru.geekbrains.geoweather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.geekbrains.geoweather.model.WeatherResponse;


public interface AccuWeather  {

    @GET("/currentconditions/v1/{locationKey}")
    Call<WeatherResponse> loadWeather(@Path("locationKey") String locKey, @Query("apikey") String ApiKey, @Query("language") String language,
                                      @Query("details") String details);
}
