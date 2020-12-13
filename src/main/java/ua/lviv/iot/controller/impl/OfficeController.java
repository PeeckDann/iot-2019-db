package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Office;
import ua.lviv.iot.service.impl.OfficeService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/office")
public class OfficeController extends AbstractController<Office, Integer> {

    @Autowired
    OfficeService officeService;

    @Override
    public ServiceTemplate<Office, Integer> getService() {
        return officeService;
    }

}