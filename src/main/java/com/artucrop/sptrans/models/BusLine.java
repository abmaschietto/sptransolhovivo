package com.artucrop.sptrans.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BusLine {
    @JsonProperty("tp")
    private String terminalIda;

    @JsonProperty("ts")
    private String terminalVolta;

    @JsonProperty("sl")
    private int sentidoLinha;

}
