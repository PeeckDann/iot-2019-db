package ua.lviv.iot.dataaccess;

import ua.lviv.iot.model.entity.IpPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpPhoneRepository extends JpaRepository<IpPhone, Integer> {

}