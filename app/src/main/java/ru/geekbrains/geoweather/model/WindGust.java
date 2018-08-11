package ru.geekbrains.geoweather.model;

import com.google.gson.annotations.SerializedName;


public class WindGust {

    @SerializedName("Speed")
    private Speed speed;

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Speed getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return
                "WindGust{" +
                        "speed = '" + speed + '\'' +
                        "}";
    }
}