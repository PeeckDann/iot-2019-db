package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.PrinterRepository;
import ua.lviv.iot.model.entity.Printer;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PrinterService extends AbstractService<Printer, Integer> {

    @Autowired
    PrinterRepository printerRepository;

    @Override
    public JpaRepository<Printer, Integer> getRepository() {
        return printerRepository;
    }

}