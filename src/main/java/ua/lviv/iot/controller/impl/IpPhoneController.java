package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.IpPhone;
import ua.lviv.iot.service.impl.IpPhoneService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/ipphone")
public class IpPhoneController extends AbstractController<IpPhone, Integer> {

    @Autowired
    IpPhoneService ipPhoneService;

    @Override
    public ServiceTemplate<IpPhone, Integer> getService() {
        return ipPhoneService;
    }

}