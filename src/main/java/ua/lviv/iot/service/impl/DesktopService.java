package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.DesktopRepository;
import ua.lviv.iot.model.entity.Desktop;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DesktopService extends AbstractService<Desktop, Integer> {

    @Autowired
    DesktopRepository desktopRepository;

    @Override
    public JpaRepository<Desktop, Integer> getRepository() {
        return desktopRepository;
    }

}