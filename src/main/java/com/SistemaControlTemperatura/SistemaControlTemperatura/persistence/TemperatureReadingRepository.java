package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence;


import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.crud.TemperatureReadingCrudRepository;
import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.Device;
import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.TemperatureReading;

import java.util.List;
import java.util.Optional;

public class TemperatureReadingRepository {

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

    public Device save(TemperatureReading temperatureReading) {
        return temperatureReadingCrudRepository.save(temperatureReading);
    }

    public void delete(TemperatureReading temperatureReading) {
        temperatureReadingCrudRepository.delete(temperatureReading);
    }

    public long count() {
        return temperatureReadingCrudRepository.count();
    }
}
