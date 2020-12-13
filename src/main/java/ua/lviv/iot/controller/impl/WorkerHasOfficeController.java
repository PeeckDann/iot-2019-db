package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.WorkerHasOffice;
import ua.lviv.iot.service.impl.WorkerHasOfficeService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/workerhasoffice")
public class WorkerHasOfficeController extends AbstractController<WorkerHasOffice, Integer> {

    @Autowired
    WorkerHasOfficeService workerHasOfficeService;

    @Override
    public ServiceTemplate<WorkerHasOffice, Integer> getService() {
        return workerHasOfficeService;
    }

}