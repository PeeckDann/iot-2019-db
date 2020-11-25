package ua.lviv.iot.service;

import java.sql.SQLException;
import java.util.List;

public interface ServiceTemplate<T, ID> {

    List<T> getAll() throws SQLException;

    T getBy(ID id) throws SQLException;

    int delete(ID id) throws SQLException;

    int update(T entity) throws SQLException;

    int create(T entity) throws SQLException;

}