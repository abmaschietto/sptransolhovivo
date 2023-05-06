package com.artucrop.sptrans.service;

import com.artucrop.sptrans.integration.SpTransClient;
import com.artucrop.sptrans.models.BusLine;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SpTransService implements BusService{

    private final SpTransClient spTransClient;
    public List<BusLine> getBusLines(String busLineName) {
        return spTransClient.getBuses(busLineName);
    }

    @Override
    public void getBusLine(String busLineName) {

    }

}
