package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Location;
import ua.lviv.iot.service.impl.LocationService;

public class LocationController extends AbstractBaseController<Location, Integer, LocationService> {

    public LocationController() {
        super(LocationService.class);
    }

}
