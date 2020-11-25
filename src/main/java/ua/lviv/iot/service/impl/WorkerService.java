package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.WorkerDao;
import ua.lviv.iot.model.entity.Worker;
import ua.lviv.iot.service.AbstractService;

public class WorkerService extends AbstractService<Worker, Integer, WorkerDao> {

    public WorkerService() {
        super(WorkerDao.class);
    }

}