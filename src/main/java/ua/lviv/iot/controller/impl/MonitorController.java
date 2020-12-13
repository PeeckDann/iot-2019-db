package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Monitor;
import ua.lviv.iot.service.impl.MonitorService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/monitor")
public class MonitorController extends AbstractController<Monitor, Integer> {

    @Autowired
    MonitorService monitorService;

    @Override
    public ServiceTemplate<Monitor, Integer> getService() {
        return monitorService;
    }

}