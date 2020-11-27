package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Office;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class OfficeDao extends AbstractBaseDao<Office, Integer> {

    public OfficeDao() {
        super(Office.class);
    }

}