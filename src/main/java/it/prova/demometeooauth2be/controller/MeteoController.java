package it.prova.demometeooauth2be.controller;

import it.prova.demometeooauth2be.dto.CurrentMeteoDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "meteo")
@CrossOrigin
public class MeteoController {

    String city = "London";

    @GetMapping(value = "/{cityFromParam}")
    public CurrentMeteoDTO getCurrentMeteo(@PathVariable String cityFromParam) {

        if(cityFromParam != null && !cityFromParam.isBlank()){
            this.city= cityFromParam;
        }
         final String url = "http://api.weatherapi.com/v1/current.json?key=6c438253cd0e43aba9994025232308 &q=" + city + "&aqi=no";

        RestTemplate restTemplate = new RestTemplate();
        CurrentMeteoDTO currentMeteoDTO = restTemplate.getForObject(url, CurrentMeteoDTO.class);
        return currentMeteoDTO;
    }



}
