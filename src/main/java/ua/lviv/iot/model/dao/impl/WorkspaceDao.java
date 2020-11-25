package ua.lviv.iot.model.dao.impl;

import ua.lviv.iot.model.entity.Workspace;
import ua.lviv.iot.model.dao.AbstractBaseDao;

public class WorkspaceDao extends AbstractBaseDao<Workspace, Integer> {

    public WorkspaceDao() {
        super(Workspace.class);
    }

}