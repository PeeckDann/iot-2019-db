package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.MonitorRepository;
import ua.lviv.iot.model.entity.Monitor;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MonitorService extends AbstractService<Monitor, Integer> {

    @Autowired
    MonitorRepository monitorRepository;

    @Override
    public JpaRepository<Monitor, Integer> getRepository() {
        return monitorRepository;
    }

}