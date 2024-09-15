package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence;


import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.crud.TemperatureReadingCrudRepository;
import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.Device;
import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.TemperatureReading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemperatureReadingRepository {

    @Autowired
    private TemperatureReadingCrudRepository temperatureReadingCrudRepository;

    public List<TemperatureReading> findAll() {
        return temperatureReadingCrudRepository.findAll();
    }

    public Optional<TemperatureReading> findById(int id) {
        return temperatureReadingCrudRepository.findById(id);
    }

    public boolean existsById(int id) {
        return temperatureReadingCrudRepository.existsById(id);
    }

    public TemperatureReading save(TemperatureReading temperatureReading) {
        return temperatureReadingCrudRepository.save(temperatureReading);
    }

    public void deleteById(int id) {
        temperatureReadingCrudRepository.deleteById(id);
    }

    public long count() {
        return temperatureReadingCrudRepository.count();
    }
}
