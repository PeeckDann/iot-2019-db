package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.WorkerHasOfficeDao;
import ua.lviv.iot.model.entity.WorkerHasOffice;
import ua.lviv.iot.service.AbstractService;

public class WorkerHasOfficeService extends AbstractService<WorkerHasOffice, Integer, WorkerHasOfficeDao> {

    public WorkerHasOfficeService() {
        super(WorkerHasOfficeDao.class);
    }

}