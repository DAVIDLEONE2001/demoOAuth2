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
public class Condition {
    @SerializedName("code")
    private int code;
    @SerializedName("icon")
    private String icon;
    @SerializedName("text")
    private String text;
}
