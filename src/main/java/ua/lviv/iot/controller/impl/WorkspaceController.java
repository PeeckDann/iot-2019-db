package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Workspace;
import ua.lviv.iot.service.impl.WorkspaceService;

public class WorkspaceController extends AbstractBaseController<Workspace, Integer, WorkspaceService> {

    public WorkspaceController() {
        super(WorkspaceService.class);
    }

}
