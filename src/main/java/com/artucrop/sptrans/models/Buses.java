package com.artucrop.sptrans.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Buses {

    @JsonProperty("p")
    public String prefixoVeiculo;

    @JsonProperty("py")
    public double posicaoY;

    @JsonProperty("px")
    public double posicaoX;
}
