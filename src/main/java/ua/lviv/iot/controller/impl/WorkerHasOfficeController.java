package ua.lviv.iot.controller.impl;

import ua.lviv.iot.controller.AbstractBaseController;
import ua.lviv.iot.model.entity.WorkerHasOffice;
import ua.lviv.iot.service.impl.WorkerHasOfficeService;

public class WorkerHasOfficeController
        extends AbstractBaseController<WorkerHasOffice, Integer, WorkerHasOfficeService> {

    public WorkerHasOfficeController() {
        super(WorkerHasOfficeService.class);
    }

}
