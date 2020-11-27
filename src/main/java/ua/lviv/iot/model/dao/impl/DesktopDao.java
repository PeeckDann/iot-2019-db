package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Desktop;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class DesktopDao extends AbstractBaseDao<Desktop, Integer> {

    public DesktopDao() {
        super(Desktop.class);
    }

}