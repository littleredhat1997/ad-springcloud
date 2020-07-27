package com.example.weather.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;

    private String city;

    private String aqi;

    private String ganmao;

    private String wendu;

    private Yesterday yesterday;

    private List<Forecast> forecast;
}
