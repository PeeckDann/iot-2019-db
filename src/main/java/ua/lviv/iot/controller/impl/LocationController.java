package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Location;
import ua.lviv.iot.service.impl.LocationService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/location")
public class LocationController extends AbstractController<Location, Integer> {

    @Autowired
    LocationService locationService;

    @Override
    public ServiceTemplate<Location, Integer> getService() {
        return locationService;
    }

}