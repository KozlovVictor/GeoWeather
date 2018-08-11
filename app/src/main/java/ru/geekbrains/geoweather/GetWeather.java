package ru.geekbrains.geoweather;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.geekbrains.geoweather.model.WeatherResponse;


public interface GetWeather {

    @GET("/currentconditions/v1/{locationKey}")
    Call<List<WeatherResponse>> loadWeather(@Path("locationKey") String locKey, @Query("apikey") String ApiKey, @Query("language") String language,
                                            @Query("details") String details);
}
