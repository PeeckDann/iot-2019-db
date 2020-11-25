package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.WorkerHasOffice;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class WorkerHasOfficeDao extends AbstractBaseDao<WorkerHasOffice, Integer> {

    public WorkerHasOfficeDao() {
        super(WorkerHasOffice.class);
    }

}