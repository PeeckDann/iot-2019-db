package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.WorkerHasOfficeRepository;
import ua.lviv.iot.model.entity.WorkerHasOffice;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkerHasOfficeService extends AbstractService<WorkerHasOffice, Integer> {

    @Autowired
    WorkerHasOfficeRepository workerHasOfficeRepository;

    @Override
    public JpaRepository<WorkerHasOffice, Integer> getRepository() {
        return workerHasOfficeRepository;
    }

}