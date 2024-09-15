package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.controller;

import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.TemperatureReadingRepository;
import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.TemperatureReading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/temperatures")
public class TemperatureReadingController {

    @Autowired
    private TemperatureReadingRepository temperatureReadingRepository;

    @GetMapping("/getAll")
    public List<TemperatureReading> getAllDevices() {
        return temperatureReadingRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<TemperatureReading> getDeviceById(@PathVariable int id) {
        return temperatureReadingRepository.findById(id);
    }

    @PostMapping("/save")
    public TemperatureReading createDevice(@RequestBody TemperatureReading device) {
        return temperatureReadingRepository.save(device);
    }

    @PutMapping("/update/{id}")
    public TemperatureReading updateDevice(@PathVariable int id, @RequestBody TemperatureReading device) {
        device.setId(id);
        return temperatureReadingRepository.save(device);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDevice(@PathVariable int id) {
        temperatureReadingRepository.deleteById(id);
    }
}