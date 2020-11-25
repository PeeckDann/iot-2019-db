package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Router;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class RouterDao extends AbstractBaseDao<Router, Integer> {

    public RouterDao() {
        super(Router.class);
    }

}