package com.artucrop.sptrans.service;

import com.artucrop.sptrans.models.BusLine;

import java.util.List;

public interface BusService {
    List<BusLine> getBusLines(String busLineName);
}
