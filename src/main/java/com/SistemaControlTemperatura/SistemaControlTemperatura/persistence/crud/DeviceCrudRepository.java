package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.crud;

import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.Device;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DeviceCrudRepository extends CrudRepository<Device, Integer> {

    List<Device> findAll();
    Optional<Device> findById(Integer id);
    boolean existsById(Integer id);
    Device save(Device device);
    void deleteById(Integer id);
    long count();
}
