package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TemperatureReading")//JPA convierte camelCase en snake_case
public class TemperatureReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double temperature;
    @Column(name = "reading_time")
    private LocalDateTime readingTime;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;
}
