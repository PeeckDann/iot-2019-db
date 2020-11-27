package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.RouterDao;
import ua.lviv.iot.model.entity.Router;
import ua.lviv.iot.service.AbstractService;

public class RouterService extends AbstractService<Router, Integer, RouterDao> {

    public RouterService() {
        super(RouterDao.class);
    }

}