package ua.lviv.iot.service.impl;

import ua.lviv.iot.model.dao.impl.WorkspaceDao;
import ua.lviv.iot.model.entity.Workspace;
import ua.lviv.iot.service.AbstractService;

public class WorkspaceService extends AbstractService<Workspace, Integer, WorkspaceDao> {

    public WorkspaceService() {
        super(WorkspaceDao.class);
    }

}