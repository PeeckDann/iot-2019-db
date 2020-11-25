package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Printer;
import ua.lviv.iot.service.impl.PrinterService;

public class PrinterController extends AbstractBaseController<Printer, Integer, PrinterService> {

    public PrinterController() {
        super(PrinterService.class);
    }

}
