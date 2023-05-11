package com.artucrop.sptrans.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BusPositionAndTime {

    @JsonProperty("hr")
    public String horaInfoGerada;
    @JsonProperty("vs")
    public List<Buses> buses;



}
