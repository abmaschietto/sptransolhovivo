package com.artucrop.sptrans.fixture;

import com.artucrop.sptrans.models.BusPositionAndTime;
import com.artucrop.sptrans.models.Buses;

import java.util.Arrays;

public class BusFixture {

    public static BusPositionAndTime createBusPositionAndTime(){
        return BusPositionAndTime.builder()
                .horaInfoGerada("21:30")
                .buses(Arrays.asList(new Buses()))
                .build();
    }
}
