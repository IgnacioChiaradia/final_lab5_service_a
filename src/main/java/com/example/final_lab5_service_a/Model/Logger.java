package com.example.final_lab5_service_a.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Logger {

    @Id
    private Integer UUID;
    private Integer discount;
    private LocalDateTime date;

}
