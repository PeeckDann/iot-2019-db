package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.WorkerHasWorkspace;
import ua.lviv.iot.service.impl.WorkerHasWorkspaceService;

public class WorkerHasWorkspaceController
        extends AbstractBaseController<WorkerHasWorkspace, Integer, WorkerHasWorkspaceService> {

    public WorkerHasWorkspaceController() {
        super(WorkerHasWorkspaceService.class);
    }

}
