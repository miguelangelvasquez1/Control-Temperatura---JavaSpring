package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.crud;

import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.TemperatureReadingRepository;
import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.Device;
import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.TemperatureReading;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TemperatureReadingCrudRepository extends CrudRepository<TemperatureReading, Long> {

    List<TemperatureReading> findAll();
    Optional<TemperatureReading> findById(Integer id);
    boolean existsById(Integer id);
    Device save(TemperatureReading temperatureReading);
    void deleteById(Integer id);
    long count();
}
