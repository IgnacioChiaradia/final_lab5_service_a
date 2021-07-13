package com.example.final_lab5_service_a.Service;

import com.example.final_lab5_service_a.Model.Logger;
import com.example.final_lab5_service_a.Repository.LoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerService {

    @Autowired
    private LoggerRepository loggerRepository;

    public Logger getOne(Integer UUID){
        Logger logger = loggerRepository.getById(UUID);
        logger.setDiscount((Integer) (Math.random() * 10));

        return logger;
    }
}
