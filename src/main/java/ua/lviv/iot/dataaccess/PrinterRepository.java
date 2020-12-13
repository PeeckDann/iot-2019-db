package ua.lviv.iot.dataaccess;

import ua.lviv.iot.model.entity.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterRepository extends JpaRepository<Printer, Integer> {

}