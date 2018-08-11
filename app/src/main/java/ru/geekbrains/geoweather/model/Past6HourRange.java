package ru.geekbrains.geoweather.model;

import com.google.gson.annotations.SerializedName;


public class Past6HourRange {

    @SerializedName("Minimum")
    private Minimum minimum;

    @SerializedName("Maximum")
    private Maximum maximum;

    public void setMinimum(Minimum minimum) {
        this.minimum = minimum;
    }

    public Minimum getMinimum() {
        return minimum;
    }

    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
    }

    public Maximum getMaximum() {
        return maximum;
    }

    @Override
    public String toString() {
        return
                "Past6HourRange{" +
                        "minimum = '" + minimum + '\'' +
                        ",maximum = '" + maximum + '\'' +
                        "}";
    }
}