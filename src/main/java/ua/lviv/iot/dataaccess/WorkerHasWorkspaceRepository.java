package ua.lviv.iot.dataaccess;

import ua.lviv.iot.model.entity.WorkerHasWorkspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerHasWorkspaceRepository extends JpaRepository<WorkerHasWorkspace, Integer> {

}