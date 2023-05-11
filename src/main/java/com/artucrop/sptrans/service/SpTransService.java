package com.artucrop.sptrans.service;

import com.artucrop.sptrans.integration.SpTransClient;
import com.artucrop.sptrans.models.BusLine;
import com.artucrop.sptrans.models.BusPositionAndTime;
import lombok.RequiredArgsConstructor;
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
        this.getBusByLineID("971D");
    }

    public List<BusLine> getBusByLineID(String busLineName) {
        var buses = spTransClient.getBuses(busLineName);
        buses.forEach(System.out::println);
        return buses;
    }


    public BusPositionAndTime getTimeToArrive(String linha) {
        return spTransClient.getBusPosition(linha);
    }
}
