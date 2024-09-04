package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;

    @OneToMany(mappedBy = "device")
    private List<TemperatureReading> temperatureReadings;
}
