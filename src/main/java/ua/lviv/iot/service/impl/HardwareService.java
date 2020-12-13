package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.HardwareRepository;
import ua.lviv.iot.model.entity.Hardware;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class HardwareService extends AbstractService<Hardware, Integer> {

    @Autowired
    HardwareRepository hardwareRepository;

    @Override
    public JpaRepository<Hardware, Integer> getRepository() {
        return hardwareRepository;
    }

}