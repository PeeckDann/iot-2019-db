package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Printer;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class PrinterDao extends AbstractBaseDao<Printer, Integer> {

    public PrinterDao() {
        super(Printer.class);
    }

}