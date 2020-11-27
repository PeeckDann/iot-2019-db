package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.IpPhoneDao;
import ua.lviv.iot.model.entity.IpPhone;
import ua.lviv.iot.service.AbstractService;

public class IpPhoneService extends AbstractService<IpPhone, Integer, IpPhoneDao> {

    public IpPhoneService() {
        super(IpPhoneDao.class);
    }

}