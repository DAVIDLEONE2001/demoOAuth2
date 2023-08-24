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
public class CurrentMeteoDTO {


    @SerializedName("current")
    private Current current;
    @SerializedName("location")
    private Location location;
}
