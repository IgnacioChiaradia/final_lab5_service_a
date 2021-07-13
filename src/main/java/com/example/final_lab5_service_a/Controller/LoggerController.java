package com.example.final_lab5_service_a.Controller;

import com.example.final_lab5_service_a.Model.Logger;
import com.example.final_lab5_service_a.Service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LoggerController {

    private LoggerService loggerService;

    @Autowired
    public LoggerController(LoggerService loggerService){
        this.loggerService = loggerService;
    }

    @GetMapping("/{id}")
    public ReponseEntity<Logger> getById(@PathVariable Integer UUID) {
        Logger logger = loggerService.getOne(UUID);
        return ResponseEntity.ok(logger);
    }




}