package ru.geekbrains.geoweather.model;

import com.google.gson.annotations.SerializedName;


public class PrecipitationSummary {

    @SerializedName("Past6Hours")
    private Past6Hours past6Hours;

    @SerializedName("Precipitation")
    private Precipitation precipitation;

    @SerializedName("Past9Hours")
    private Past9Hours past9Hours;

    @SerializedName("Past3Hours")
    private Past3Hours past3Hours;

    @SerializedName("PastHour")
    private PastHour pastHour;

    @SerializedName("Past18Hours")
    private Past18Hours past18Hours;

    @SerializedName("Past24Hours")
    private Past24Hours past24Hours;

    @SerializedName("Past12Hours")
    private Past12Hours past12Hours;

    public void setPast6Hours(Past6Hours past6Hours) {
        this.past6Hours = past6Hours;
    }

    public Past6Hours getPast6Hours() {
        return past6Hours;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public void setPast9Hours(Past9Hours past9Hours) {
        this.past9Hours = past9Hours;
    }

    public Past9Hours getPast9Hours() {
        return past9Hours;
    }

    public void setPast3Hours(Past3Hours past3Hours) {
        this.past3Hours = past3Hours;
    }

    public Past3Hours getPast3Hours() {
        return past3Hours;
    }

    public void setPastHour(PastHour pastHour) {
        this.pastHour = pastHour;
    }

    public PastHour getPastHour() {
        return pastHour;
    }

    public void setPast18Hours(Past18Hours past18Hours) {
        this.past18Hours = past18Hours;
    }

    public Past18Hours getPast18Hours() {
        return past18Hours;
    }

    public void setPast24Hours(Past24Hours past24Hours) {
        this.past24Hours = past24Hours;
    }

    public Past24Hours getPast24Hours() {
        return past24Hours;
    }

    public void setPast12Hours(Past12Hours past12Hours) {
        this.past12Hours = past12Hours;
    }

    public Past12Hours getPast12Hours() {
        return past12Hours;
    }

    @Override
    public String toString() {
        return
                "PrecipitationSummary{" +
                        "past6Hours = '" + past6Hours + '\'' +
                        ",precipitation = '" + precipitation + '\'' +
                        ",past9Hours = '" + past9Hours + '\'' +
                        ",past3Hours = '" + past3Hours + '\'' +
                        ",pastHour = '" + pastHour + '\'' +
                        ",past18Hours = '" + past18Hours + '\'' +
                        ",past24Hours = '" + past24Hours + '\'' +
                        ",past12Hours = '" + past12Hours + '\'' +
                        "}";
    }
}