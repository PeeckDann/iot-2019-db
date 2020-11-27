package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.IpPhone;
import ua.lviv.iot.service.impl.IpPhoneService;

public class IpPhoneController extends AbstractBaseController<IpPhone, Integer, IpPhoneService> {

    public IpPhoneController() {
        super(IpPhoneService.class);
    }

}
