package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Laptop;
import ua.lviv.iot.service.impl.LaptopService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/laptop")
public class LaptopController extends AbstractController<Laptop, Integer> {

    @Autowired
    LaptopService laptopService;

    @Override
    public ServiceTemplate<Laptop, Integer> getService() {
        return laptopService;
    }

}
