package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Hardware;
import ua.lviv.iot.service.impl.HardwareService;

public class HardwareController extends AbstractBaseController<Hardware, Integer, HardwareService> {

    public HardwareController() {
        super(HardwareService.class);
    }

}
