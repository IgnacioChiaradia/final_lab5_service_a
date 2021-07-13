package com.example.final_lab5_service_a.Controller;

import com.example.final_lab5_service_a.Model.Logger;
import com.example.final_lab5_service_a.Service.LoggerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoggerControllerTest {

    LoggerService loggerService;
    LoggerController loggerController;

    @BeforeEach
    public void setUp() {
        loggerService = mock(LoggerService.class);
        loggerController = new LoggerController(loggerService);
    }

    @Test
    public void getTest() {
        Logger logger = new Logger();
        // when
        when(loggerService.getOne(anyInt())).thenReturn(logger);

        ResponseEntity<Logger> response = loggerController.getById(1);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(logger, response.getBody());
    }

}