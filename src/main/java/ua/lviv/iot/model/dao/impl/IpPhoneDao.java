package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.IpPhone;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class IpPhoneDao extends AbstractBaseDao<IpPhone, Integer> {

    public IpPhoneDao() {
        super(IpPhone.class);
    }

}