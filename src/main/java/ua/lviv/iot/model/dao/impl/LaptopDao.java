package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Laptop;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class LaptopDao extends AbstractBaseDao<Laptop, Integer> {

    public LaptopDao() {
        super(Laptop.class);
    }

}