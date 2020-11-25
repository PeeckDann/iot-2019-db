package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Monitor;
import ua.lviv.iot.service.impl.MonitorService;

public class MonitorController extends AbstractBaseController<Monitor, Integer, MonitorService> {

    public MonitorController() {
        super(MonitorService.class);
    }

}
