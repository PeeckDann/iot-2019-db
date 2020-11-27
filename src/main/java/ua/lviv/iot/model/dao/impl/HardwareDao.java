package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Hardware;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class HardwareDao extends AbstractBaseDao<Hardware, Integer> {

    public HardwareDao() {
        super(Hardware.class);
    }

}
