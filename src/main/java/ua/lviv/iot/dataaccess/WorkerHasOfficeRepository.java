package ua.lviv.iot.dataaccess;

import ua.lviv.iot.model.entity.WorkerHasOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerHasOfficeRepository extends JpaRepository<WorkerHasOffice, Integer> {

}