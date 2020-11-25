package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.LocationDao;
import ua.lviv.iot.model.entity.Location;
import ua.lviv.iot.service.AbstractService;

public class LocationService extends AbstractService<Location, Integer, LocationDao> {

    public LocationService() {
        super(LocationDao.class);
    }

}