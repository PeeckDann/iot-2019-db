package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.WorkerHasWorkspaceDao;
import ua.lviv.iot.model.entity.WorkerHasWorkspace;
import ua.lviv.iot.service.AbstractService;

public class WorkerHasWorkspaceService extends AbstractService<WorkerHasWorkspace, Integer, WorkerHasWorkspaceDao> {

    public WorkerHasWorkspaceService() {
        super(WorkerHasWorkspaceDao.class);
    }

}