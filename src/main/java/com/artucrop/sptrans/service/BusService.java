package com.artucrop.sptrans.service;

import com.artucrop.sptrans.models.BusLine;

import java.util.List;

public interface BusService {

    void getBusLine(String busLineName);

    List<BusLine> getBusLines(String busLineName);
}
