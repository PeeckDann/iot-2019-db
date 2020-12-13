package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.IpPhoneRepository;
import ua.lviv.iot.model.entity.IpPhone;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class IpPhoneService extends AbstractService<IpPhone, Integer> {

    @Autowired
    IpPhoneRepository ipPhoneRepository;

    @Override
    public JpaRepository<IpPhone, Integer> getRepository() {
        return ipPhoneRepository;
    }

}