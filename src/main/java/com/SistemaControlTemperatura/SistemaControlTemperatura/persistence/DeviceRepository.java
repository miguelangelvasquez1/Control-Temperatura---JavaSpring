package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence;

import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.crud.DeviceCrudRepository;
import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceRepository {

    @Autowired
    private DeviceCrudRepository deviceCrudRepository;

    public List<Device> findAll() {
        return deviceCrudRepository.findAll();
    }

    public Optional<Device> findById(int id) {
        return deviceCrudRepository.findById(id);
    }

    public boolean existsById(int id) {
        return deviceCrudRepository.existsById(id);
    }

    public Device save(Device device) {
        return deviceCrudRepository.save(device);
    }

    public void deleteById(int id) {
        deviceCrudRepository.deleteById(id);
    }

    public long count() {
        return deviceCrudRepository.count();
    }
}
