package com.artucrop.sptrans.service;

import com.artucrop.sptrans.fixture.BusFixture;
import com.artucrop.sptrans.integration.SpTransClient;
import com.artucrop.sptrans.models.BusLine;
import com.artucrop.sptrans.models.BusPositionAndTime;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class SpTransServiceTest {

    SpTransClient spTransClientMock = Mockito.mock(SpTransClient.class);
    SpTransService spTransService = new SpTransService(spTransClientMock);

    @Test
    void getBusLines(){
        when(spTransClientMock.getBuses(any())).thenReturn(Arrays.asList(new BusLine()));
        var busLines = spTransService.getBusByLineID("971D");

        assertThat(busLines.isEmpty(), is(false));
    }


    @Test
    void getBusTimeToArrive(){
        when(spTransClientMock.getBusPosition("2499")).thenReturn(BusFixture.createBusPositionAndTime());
        BusPositionAndTime busPositionAndTime = spTransService.getTimeToArrive("2499");

        assertThat(busPositionAndTime.getHoraInfoGerada(), is("21:30"));
    }

}