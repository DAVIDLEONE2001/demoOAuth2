package it.prova.demometeooauth2be.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Current {
    @SerializedName("gust_kph")
    private double gust_kph;
    @SerializedName("gust_mph")
    private double gust_mph;
    @SerializedName("uv")
    private int uv;
    @SerializedName("vis_miles")
    private int vis_miles;
    @SerializedName("vis_km")
    private int vis_km;
    @SerializedName("feelslike_f")
    private int feelslike_f;
    @SerializedName("feelslike_c")
    private double feelslike_c;
    @SerializedName("cloud")
    private int cloud;
    @SerializedName("humidity")
    private int humidity;
    @SerializedName("precip_in")
    private int precip_in;
    @SerializedName("precip_mm")
    private int precip_mm;
    @SerializedName("pressure_in")
    private double pressure_in;
    @SerializedName("pressure_mb")
    private int pressure_mb;
    @SerializedName("wind_dir")
    private String wind_dir;
    @SerializedName("wind_degree")
    private int wind_degree;
    @SerializedName("wind_kph")
    private double wind_kph;
    @SerializedName("wind_mph")
    private double wind_mph;
    @SerializedName("condition")
    private Condition condition;
    @SerializedName("is_day")
    private int is_day;
    @SerializedName("temp_f")
    private double temp_f;
    @SerializedName("temp_c")
    private int temp_c;
    @SerializedName("last_updated")
    private String last_updated;
    @SerializedName("last_updated_epoch")
    private int last_updated_epoch;
}
