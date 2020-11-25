package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.PrinterDao;
import ua.lviv.iot.model.entity.Printer;
import ua.lviv.iot.service.AbstractService;

public class PrinterService extends AbstractService<Printer, Integer, PrinterDao> {

    public PrinterService() {
        super(PrinterDao.class);
    }

}