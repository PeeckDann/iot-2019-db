package ua.lviv.iot.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import ua.lviv.iot.persistant.ConnectionManager;
import ua.lviv.iot.service.AbstractService;

@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
public abstract class AbstractBaseController<T, ID, SERVICE> implements ControllerTemplate<T, ID> {

    AbstractService service;

    public AbstractBaseController(Class<SERVICE> currentClass) {
        try {
            service = (AbstractService) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> getAll() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<T> entities = service.getAll();
        connection.close();
        return entities;
    }

    @Override
    public T getBy(ID id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        T entity = (T) service.getBy(id);
        connection.close();
        return entity;
    }

    @Override
    public int delete(ID id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        int result = service.delete(id);
        connection.close();
        return result;
    }

    @Override
    public int update(T entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        int result = service.update(entity);
        connection.close();
        return result;
    }

    @Override
    public int create(T entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        int result = service.create(entity);
        connection.close();
        return result;
    }

}