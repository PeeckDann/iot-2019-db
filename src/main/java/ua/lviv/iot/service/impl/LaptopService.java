package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.LaptopRepository;
import ua.lviv.iot.model.entity.Laptop;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LaptopService extends AbstractService<Laptop, Integer> {

    @Autowired
    LaptopRepository laptopRepository;

    @Override
    public JpaRepository<Laptop, Integer> getRepository() {
        return laptopRepository;
    }

}