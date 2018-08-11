package ru.geekbrains.geoweather.model;

import com.google.gson.annotations.SerializedName;


public class Imperial {

    @SerializedName("UnitType")
    private int unitType;

    @SerializedName("Value")
    private double value;

    @SerializedName("Unit")
    private String unit;

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

    public int getUnitType() {
        return unitType;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return
                "Imperial{" +
                        "unitType = '" + unitType + '\'' +
                        ",value = '" + value + '\'' +
                        ",unit = '" + unit + '\'' +
                        "}";
    }
}