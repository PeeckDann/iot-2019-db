package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Printer;
import ua.lviv.iot.service.impl.PrinterService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/printer")
public class PrinterController extends AbstractController<Printer, Integer> {

    @Autowired
    PrinterService printerService;

    @Override
    public ServiceTemplate<Printer, Integer> getService() {
        return printerService;
    }

}