package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.WorkerHasWorkspace;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class WorkerHasWorkspaceDao extends AbstractBaseDao<WorkerHasWorkspace, Integer> {

    public WorkerHasWorkspaceDao() {
        super(WorkerHasWorkspace.class);
    }

}