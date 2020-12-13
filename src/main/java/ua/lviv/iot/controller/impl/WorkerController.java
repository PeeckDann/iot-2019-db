package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Worker;
import ua.lviv.iot.service.impl.WorkerService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/worker")
public class WorkerController extends AbstractController<Worker, Integer> {

    @Autowired
    WorkerService workerService;

    @Override
    public ServiceTemplate<Worker, Integer> getService() {
        return workerService;
    }

}