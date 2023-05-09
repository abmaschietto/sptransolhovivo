package com.artucrop.sptrans.service;

import com.artucrop.sptrans.models.BusLine;
import com.artucrop.sptrans.models.BusPositionAndTime;

import java.util.List;

public interface BusService {
    List<BusLine> getBusByLineID(String busLineName);
    BusPositionAndTime getTimeToArrive(String number);
}
