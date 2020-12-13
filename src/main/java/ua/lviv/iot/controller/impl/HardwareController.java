package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Hardware;
import ua.lviv.iot.service.impl.HardwareService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/hardware")
public class HardwareController extends AbstractController<Hardware, Integer> {

    @Autowired
    HardwareService hardwareService;

    @Override
    public ServiceTemplate<Hardware, Integer> getService() {
        return hardwareService;
    }

}