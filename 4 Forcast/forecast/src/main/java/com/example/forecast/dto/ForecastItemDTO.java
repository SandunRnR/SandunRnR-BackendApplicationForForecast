package com.example.forecast.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForecastItemDTO {

    private int ID;
    private String itemName;
    private int forecastingInterval;

}
