package ru.geekbrains.geoweather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.geekbrains.geoweather.model.Response;

public interface AccuWeather  {

    @GET("/currentconditions/v1/")
    Call<Response> loadWeather(@Query("apikey") String ApiKey, @Query("language") String language,
                               @Query("details") String details);
}
