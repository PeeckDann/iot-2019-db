package ua.lviv.iot.dataaccess;

import ua.lviv.iot.model.entity.Desktop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopRepository extends JpaRepository<Desktop, Integer> {

}