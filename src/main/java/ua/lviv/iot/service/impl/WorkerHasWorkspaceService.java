package ua.lviv.iot.service.impl;

import ua.lviv.iot.dataaccess.WorkerHasWorkspaceRepository;
import ua.lviv.iot.model.entity.WorkerHasWorkspace;
import ua.lviv.iot.service.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkerHasWorkspaceService extends AbstractService<WorkerHasWorkspace, Integer> {

    @Autowired
    WorkerHasWorkspaceRepository workerHasWorkspaceRepository;

    @Override
    public JpaRepository<WorkerHasWorkspace, Integer> getRepository() {
        return workerHasWorkspaceRepository;
    }

}