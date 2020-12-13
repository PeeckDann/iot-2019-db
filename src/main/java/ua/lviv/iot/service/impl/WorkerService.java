package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.WorkerRepository;
import ua.lviv.iot.model.entity.Worker;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkerService extends AbstractService<Worker, Integer> {

    @Autowired
    WorkerRepository workerRepository;

    @Override
    public JpaRepository<Worker, Integer> getRepository() {
        return workerRepository;
    }

}