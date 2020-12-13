package ua.lviv.iot.dataaccess;

import ua.lviv.iot.model.entity.Hardware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardwareRepository extends JpaRepository<Hardware, Integer> {

}
