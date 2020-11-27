package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Worker;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class WorkerDao extends AbstractBaseDao<Worker, Integer> {

    public WorkerDao() {
        super(Worker.class);
    }

}