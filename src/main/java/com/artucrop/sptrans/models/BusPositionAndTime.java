package com.artucrop.sptrans.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class BusPositionAndTime {

    @JsonProperty("hr")
    public String horaInfoGerada;
    @JsonProperty("vs")
    public List<Buses> buses;

    @Data
    class Buses {
        @JsonProperty("p")
        public String prefixoVeiculo;
        @JsonProperty("py")
        public double posicaoY;
        @JsonProperty("px")
        public double posicaoX;
    }

}
