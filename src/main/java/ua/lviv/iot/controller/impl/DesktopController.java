package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Desktop;
import ua.lviv.iot.service.impl.DesktopService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/desktop")
public class DesktopController extends AbstractController<Desktop, Integer> {

    @Autowired
    DesktopService desktopService;

    @Override
    public ServiceTemplate<Desktop, Integer> getService() {
        return desktopService;
    }

}