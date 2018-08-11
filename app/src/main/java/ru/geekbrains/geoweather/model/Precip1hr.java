package ru.geekbrains.geoweather.model;

import com.google.gson.annotations.SerializedName;


public class Precip1hr {

    @SerializedName("Metric")
    private Metric metric;

    @SerializedName("Imperial")
    private Imperial imperial;

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    public Metric getMetric() {
        return metric;
    }

    public void setImperial(Imperial imperial) {
        this.imperial = imperial;
    }

    public Imperial getImperial() {
        return imperial;
    }

    @Override
    public String toString() {
        return
                "Precip1hr{" +
                        "metric = '" + metric + '\'' +
                        ",imperial = '" + imperial + '\'' +
                        "}";
    }
}