package ru.geekbrains.geoweather.model;

import com.google.gson.annotations.SerializedName;


public class Response {

    @SerializedName("Wind")
    private Wind wind;

    @SerializedName("Temperature")
    private Temperature temperature;

    @SerializedName("Past24HourTemperatureDeparture")
    private Past24HourTemperatureDeparture past24HourTemperatureDeparture;

    @SerializedName("PressureTendency")
    private PressureTendency pressureTendency;

    @SerializedName("ObstructionsToVisibility")
    private String obstructionsToVisibility;

    @SerializedName("Ceiling")
    private Ceiling ceiling;

    @SerializedName("RealFeelTemperatureShade")
    private RealFeelTemperatureShade realFeelTemperatureShade;

    @SerializedName("EpochTime")
    private int epochTime;

    @SerializedName("RealFeelTemperature")
    private RealFeelTemperature realFeelTemperature;

    @SerializedName("RelativeHumidity")
    private int relativeHumidity;

    @SerializedName("PrecipitationSummary")
    private PrecipitationSummary precipitationSummary;

    @SerializedName("TemperatureSummary")
    private TemperatureSummary temperatureSummary;

    @SerializedName("LocalObservationDateTime")
    private String localObservationDateTime;

    @SerializedName("UVIndexText")
    private String uVIndexText;

    @SerializedName("WeatherText")
    private String weatherText;

    @SerializedName("CloudCover")
    private int cloudCover;

    @SerializedName("WindGust")
    private WindGust windGust;

    @SerializedName("UVIndex")
    private int uVIndex;

    @SerializedName("Precip1hr")
    private Precip1hr precip1hr;

    @SerializedName("WeatherIcon")
    private int weatherIcon;

    @SerializedName("DewPoint")
    private DewPoint dewPoint;

    @SerializedName("Pressure")
    private Pressure pressure;

    @SerializedName("IsDayTime")
    private boolean isDayTime;

    @SerializedName("ApparentTemperature")
    private ApparentTemperature apparentTemperature;

    @SerializedName("WetBulbTemperature")
    private WetBulbTemperature wetBulbTemperature;

    @SerializedName("Visibility")
    private Visibility visibility;

    @SerializedName("WindChillTemperature")
    private WindChillTemperature windChillTemperature;

    @SerializedName("Link")
    private String link;

    @SerializedName("MobileLink")
    private String mobileLink;

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Wind getWind() {
        return wind;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setPast24HourTemperatureDeparture(Past24HourTemperatureDeparture past24HourTemperatureDeparture) {
        this.past24HourTemperatureDeparture = past24HourTemperatureDeparture;
    }

    public Past24HourTemperatureDeparture getPast24HourTemperatureDeparture() {
        return past24HourTemperatureDeparture;
    }

    public void setPressureTendency(PressureTendency pressureTendency) {
        this.pressureTendency = pressureTendency;
    }

    public PressureTendency getPressureTendency() {
        return pressureTendency;
    }

    public void setObstructionsToVisibility(String obstructionsToVisibility) {
        this.obstructionsToVisibility = obstructionsToVisibility;
    }

    public String getObstructionsToVisibility() {
        return obstructionsToVisibility;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setRealFeelTemperatureShade(RealFeelTemperatureShade realFeelTemperatureShade) {
        this.realFeelTemperatureShade = realFeelTemperatureShade;
    }

    public RealFeelTemperatureShade getRealFeelTemperatureShade() {
        return realFeelTemperatureShade;
    }

    public void setEpochTime(int epochTime) {
        this.epochTime = epochTime;
    }

    public int getEpochTime() {
        return epochTime;
    }

    public void setRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }

    public RealFeelTemperature getRealFeelTemperature() {
        return realFeelTemperature;
    }

    public void setRelativeHumidity(int relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public int getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setPrecipitationSummary(PrecipitationSummary precipitationSummary) {
        this.precipitationSummary = precipitationSummary;
    }

    public PrecipitationSummary getPrecipitationSummary() {
        return precipitationSummary;
    }

    public void setTemperatureSummary(TemperatureSummary temperatureSummary) {
        this.temperatureSummary = temperatureSummary;
    }

    public TemperatureSummary getTemperatureSummary() {
        return temperatureSummary;
    }

    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    public void setUVIndexText(String uVIndexText) {
        this.uVIndexText = uVIndexText;
    }

    public String getUVIndexText() {
        return uVIndexText;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public void setCloudCover(int cloudCover) {
        this.cloudCover = cloudCover;
    }

    public int getCloudCover() {
        return cloudCover;
    }

    public void setWindGust(WindGust windGust) {
        this.windGust = windGust;
    }

    public WindGust getWindGust() {
        return windGust;
    }

    public void setUVIndex(int uVIndex) {
        this.uVIndex = uVIndex;
    }

    public int getUVIndex() {
        return uVIndex;
    }

    public void setPrecip1hr(Precip1hr precip1hr) {
        this.precip1hr = precip1hr;
    }

    public Precip1hr getPrecip1hr() {
        return precip1hr;
    }

    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public int getWeatherIcon() {
        return weatherIcon;
    }

    public void setDewPoint(DewPoint dewPoint) {
        this.dewPoint = dewPoint;
    }

    public DewPoint getDewPoint() {
        return dewPoint;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public void setIsDayTime(boolean isDayTime) {
        this.isDayTime = isDayTime;
    }

    public boolean isIsDayTime() {
        return isDayTime;
    }

    public void setApparentTemperature(ApparentTemperature apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public ApparentTemperature getApparentTemperature() {
        return apparentTemperature;
    }

    public void setWetBulbTemperature(WetBulbTemperature wetBulbTemperature) {
        this.wetBulbTemperature = wetBulbTemperature;
    }

    public WetBulbTemperature getWetBulbTemperature() {
        return wetBulbTemperature;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setWindChillTemperature(WindChillTemperature windChillTemperature) {
        this.windChillTemperature = windChillTemperature;
    }

    public WindChillTemperature getWindChillTemperature() {
        return windChillTemperature;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "wind = '" + wind + '\'' +
                        ",temperature = '" + temperature + '\'' +
                        ",past24HourTemperatureDeparture = '" + past24HourTemperatureDeparture + '\'' +
                        ",pressureTendency = '" + pressureTendency + '\'' +
                        ",obstructionsToVisibility = '" + obstructionsToVisibility + '\'' +
                        ",ceiling = '" + ceiling + '\'' +
                        ",realFeelTemperatureShade = '" + realFeelTemperatureShade + '\'' +
                        ",epochTime = '" + epochTime + '\'' +
                        ",realFeelTemperature = '" + realFeelTemperature + '\'' +
                        ",relativeHumidity = '" + relativeHumidity + '\'' +
                        ",precipitationSummary = '" + precipitationSummary + '\'' +
                        ",temperatureSummary = '" + temperatureSummary + '\'' +
                        ",localObservationDateTime = '" + localObservationDateTime + '\'' +
                        ",uVIndexText = '" + uVIndexText + '\'' +
                        ",weatherText = '" + weatherText + '\'' +
                        ",cloudCover = '" + cloudCover + '\'' +
                        ",windGust = '" + windGust + '\'' +
                        ",uVIndex = '" + uVIndex + '\'' +
                        ",precip1hr = '" + precip1hr + '\'' +
                        ",weatherIcon = '" + weatherIcon + '\'' +
                        ",dewPoint = '" + dewPoint + '\'' +
                        ",pressure = '" + pressure + '\'' +
                        ",isDayTime = '" + isDayTime + '\'' +
                        ",apparentTemperature = '" + apparentTemperature + '\'' +
                        ",wetBulbTemperature = '" + wetBulbTemperature + '\'' +
                        ",visibility = '" + visibility + '\'' +
                        ",windChillTemperature = '" + windChillTemperature + '\'' +
                        ",link = '" + link + '\'' +
                        ",mobileLink = '" + mobileLink + '\'' +
                        "}";
    }
}