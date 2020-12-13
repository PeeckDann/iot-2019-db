package ua.lviv.iot.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.controller.AbstractController;
import ua.lviv.iot.model.entity.Workspace;
import ua.lviv.iot.service.impl.WorkspaceService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/workspace")
public class WorkspaceController extends AbstractController<Workspace, Integer> {

    @Autowired
    WorkspaceService workspaceService;

    @Override
    public ServiceTemplate<Workspace, Integer> getService() {
        return workspaceService;
    }

}