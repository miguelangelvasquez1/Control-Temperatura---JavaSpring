package com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.controller;

import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.DeviceRepository;
import com.SistemaControlTemperatura.SistemaControlTemperatura.persistence.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    private DeviceRepository deviceRepository;

    @GetMapping("/devices")
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Device> getDeviceById(@PathVariable int id) {
        return deviceRepository.findById(id);
    }

    @PostMapping("/save")
    public Device createDevice(@RequestBody Device device) {
        return deviceRepository.save(device);
    }

    @PutMapping("/{id}")
    public Device updateDevice(@PathVariable int id, @RequestBody Device device) {

        device.setId(id);
        return deviceRepository.save(device);
    }

    @DeleteMapping("/{id}")
    public void deleteDevice(@PathVariable int id) {

        deviceRepository.deleteById(id);

    }
}
