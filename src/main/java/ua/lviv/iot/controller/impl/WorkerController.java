package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.Worker;
import ua.lviv.iot.service.impl.WorkerService;

public class WorkerController extends AbstractBaseController<Worker, Integer, WorkerService> {

    public WorkerController() {
        super(WorkerService.class);
    }

}
