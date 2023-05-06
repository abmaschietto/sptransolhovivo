package com.artucrop.sptrans.integration;

import com.artucrop.sptrans.config.SpTransConfig;
import com.artucrop.sptrans.models.BusLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
@FeignClient(value = "sptrans", url = "http://api.olhovivo.sptrans.com.br/v2.1", configuration = SpTransConfig.class)
public interface SpTransClient {

    @GetMapping(value = "/Linha/Buscar")
    List<BusLine> getBuses(@RequestParam("termosBusca") String termosBusca);

}
