package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class TemperatureReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String temperature;
    private LocalDateTime readingTime;

    @ManyToOne
    @JoinColumn(name = "idDevice", insertable = false, updatable = false)
    private Device device;
}
