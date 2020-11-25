package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.HardwareDao;
import ua.lviv.iot.model.entity.Hardware;
import ua.lviv.iot.service.AbstractService;

public class HardwareService extends AbstractService<Hardware, Integer, HardwareDao> {

    public HardwareService() {
        super(HardwareDao.class);
    }

}