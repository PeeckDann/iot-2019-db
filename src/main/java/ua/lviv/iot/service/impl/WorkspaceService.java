package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.WorkspaceRepository;
import ua.lviv.iot.model.entity.Workspace;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkspaceService extends AbstractService<Workspace, Integer> {

    @Autowired
    WorkspaceRepository workspaceRepository;

    @Override
    public JpaRepository<Workspace, Integer> getRepository() {
        return workspaceRepository;
    }

}