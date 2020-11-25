package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Laptop;
import ua.lviv.iot.service.impl.LaptopService;

public class LaptopController extends AbstractBaseController<Laptop, Integer, LaptopService> {

    public LaptopController() {
        super(LaptopService.class);
    }

}
