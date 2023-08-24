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
public class Location {
    @SerializedName("localtime")
    private String localtime;
    @SerializedName("localtime_epoch")
    private int localtime_epoch;
    @SerializedName("tz_id")
    private String tz_id;
    @SerializedName("lon")
    private double lon;
    @SerializedName("lat")
    private double lat;
    @SerializedName("country")
    private String country;
    @SerializedName("region")
    private String region;
    @SerializedName("name")
    private String name;
}
