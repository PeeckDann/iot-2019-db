package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.RouterRepository;
import ua.lviv.iot.model.entity.Router;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RouterService extends AbstractService<Router, Integer> {

    @Autowired
    RouterRepository routerRepository;

    @Override
    public JpaRepository<Router, Integer> getRepository() {
        return routerRepository;
    }

}