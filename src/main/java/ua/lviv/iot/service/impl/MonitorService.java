package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.MonitorDao;
import ua.lviv.iot.model.entity.Monitor;
import ua.lviv.iot.service.AbstractService;

public class MonitorService extends AbstractService<Monitor, Integer, MonitorDao> {

    public MonitorService() {
        super(MonitorDao.class);
    }

}