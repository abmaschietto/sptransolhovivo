package com.artucrop.sptrans.service;

import com.artucrop.sptrans.integration.SpTransClient;
import com.artucrop.sptrans.models.BusLine;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SpTransService implements BusService{



    private final SpTransClient spTransClient;
    @EventListener(ApplicationReadyEvent.class)
    public void teste(){
        this.getBusLines("Damasceno");
    }

    public List<BusLine> getBusLines(String busLineName) {

        List<BusLine> buses = spTransClient.getBuses(busLineName);
        buses.forEach(System.out::println);
        return buses;
    }


}
