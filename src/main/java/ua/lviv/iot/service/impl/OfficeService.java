package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.OfficeRepository;
import ua.lviv.iot.model.entity.Office;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OfficeService extends AbstractService<Office, Integer> {

    @Autowired
    OfficeRepository officeRepository;

    @Override
    public JpaRepository<Office, Integer> getRepository() {
        return officeRepository;
    }

}