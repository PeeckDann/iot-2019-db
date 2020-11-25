package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.OfficeDao;
import ua.lviv.iot.model.entity.Office;
import ua.lviv.iot.service.AbstractService;

public class OfficeService extends AbstractService<Office, Integer, OfficeDao> {

    public OfficeService() {
        super(OfficeDao.class);
    }

}