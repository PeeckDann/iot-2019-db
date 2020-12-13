package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.LocationRepository;
import ua.lviv.iot.model.entity.Location;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService extends AbstractService<Location, Integer> {

    @Autowired
    LocationRepository locationRepository;

    @Override
    public JpaRepository<Location, Integer> getRepository() {
        return locationRepository;
    }

}