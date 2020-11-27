package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.List;

public interface ControllerTemplate<T, ID> {

    List<T> getAll() throws SQLException;

    T getBy(ID id) throws SQLException;

    void delete(ID id) throws SQLException;

    void update(T entity) throws SQLException;

    void create(T entity) throws SQLException;

}