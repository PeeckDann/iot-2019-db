package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.LaptopDao;
import ua.lviv.iot.model.entity.Laptop;
import ua.lviv.iot.service.AbstractService;

public class LaptopService extends AbstractService<Laptop, Integer, LaptopDao> {

    public LaptopService() {
        super(LaptopDao.class);
    }

}