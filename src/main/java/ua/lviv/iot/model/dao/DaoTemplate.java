package ua.lviv.iot.model.dao;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;

public interface DaoTemplate<T, ID> {

    List<T> getAll(Session session) throws SQLException;

    T getBy(ID id, Session session) throws SQLException;

    void delete(ID id, Session session) throws SQLException;

    void update(T entity, Session session) throws SQLException;

    void create(T entity, Session session) throws SQLException;

}