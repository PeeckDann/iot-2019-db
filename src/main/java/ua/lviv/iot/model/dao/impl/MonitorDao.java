package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Monitor;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class MonitorDao extends AbstractBaseDao<Monitor, Integer> {

    public MonitorDao() {
        super(Monitor.class);
    }

}
