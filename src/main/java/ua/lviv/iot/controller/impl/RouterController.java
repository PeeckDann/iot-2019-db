package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Router;
import ua.lviv.iot.service.impl.RouterService;

public class RouterController extends AbstractBaseController<Router, Integer, RouterService> {

    public RouterController() {
        super(RouterService.class);
    }

}
