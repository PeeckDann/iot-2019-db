package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.DesktopDao;
import ua.lviv.iot.model.entity.Desktop;
import ua.lviv.iot.service.AbstractService;

public class DesktopService extends AbstractService<Desktop, Integer, DesktopDao> {

    public DesktopService() {
        super(DesktopDao.class);
    }

}