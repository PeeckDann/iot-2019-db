package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.WorkerHasWorkspace;
import ua.lviv.iot.service.impl.WorkerHasWorkspaceService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/workerhasworkspace")
public class WorkerHasWorkspaceController extends AbstractController<WorkerHasWorkspace, Integer> {

    @Autowired
    WorkerHasWorkspaceService workerHasWorkspaceService;

    @Override
    public ServiceTemplate<WorkerHasWorkspace, Integer> getService() {
        return workerHasWorkspaceService;
    }

}