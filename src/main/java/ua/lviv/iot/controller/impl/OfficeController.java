package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Office;
import ua.lviv.iot.service.impl.OfficeService;

public class OfficeController extends AbstractBaseController<Office, Integer, OfficeService> {

    public OfficeController() {
        super(OfficeService.class);
    }

}
