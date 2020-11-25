package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Location;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class LocationDao extends AbstractBaseDao<Location, Integer> {

    public LocationDao() {
        super(Location.class);
    }

}
