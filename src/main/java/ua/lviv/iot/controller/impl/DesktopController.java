package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Desktop;
import ua.lviv.iot.service.impl.DesktopService;

public class DesktopController extends AbstractBaseController<Desktop, Integer, DesktopService> {

    public DesktopController() {
        super(DesktopService.class);
    }

}
