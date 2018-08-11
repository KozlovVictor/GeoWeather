package ru.geekbrains.geoweather.model;

import com.google.gson.annotations.SerializedName;


public class PressureTendency {

    @SerializedName("Code")
    private String code;

    @SerializedName("LocalizedText")
    private String localizedText;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setLocalizedText(String localizedText) {
        this.localizedText = localizedText;
    }

    public String getLocalizedText() {
        return localizedText;
    }

    @Override
    public String toString() {
        return
                "PressureTendency{" +
                        "code = '" + code + '\'' +
                        ",localizedText = '" + localizedText + '\'' +
                        "}";
    }
}