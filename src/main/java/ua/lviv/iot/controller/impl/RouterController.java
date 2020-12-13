package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Router;
import ua.lviv.iot.service.impl.RouterService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/router")
public class RouterController extends AbstractController<Router, Integer> {

    @Autowired
    RouterService routerService;

    @Override
    public ServiceTemplate<Router, Integer> getService() {
        return routerService;
    }

}