package com.artucrop.sptrans.service;

import com.artucrop.sptrans.integration.SpTransClient;
import com.artucrop.sptrans.models.BusLine;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class SpTransServiceTest {

    @Test
    void getBusLines(){
        var spTransClientMock = Mockito.mock(SpTransClient.class);
        var spTransService = new SpTransService(spTransClientMock);

        when(spTransClientMock.getBuses("Damasceno")).thenReturn(Arrays.asList(new BusLine()));
        var busLines = spTransService.getBusLines("Damasceno");

        assertThat(busLines.isEmpty(), is(false));
    }
}