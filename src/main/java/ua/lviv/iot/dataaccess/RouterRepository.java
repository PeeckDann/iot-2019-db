package ua.lviv.iot.dataaccess;

import ua.lviv.iot.model.entity.Router;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterRepository extends JpaRepository<Router, Integer> {

}