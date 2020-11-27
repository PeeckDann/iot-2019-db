package ua.lviv.iot.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import ua.lviv.iot.model.dao.DaoTemplate;

public abstract class AbstractService<T, ID, DAO> implements ServiceTemplate<T, ID> {

    private DaoTemplate<T, ID> dataaccess;

    @SuppressWarnings({ "unchecked", "deprecation" })
    public AbstractService(Class<DAO> currentClass) {
        try {
            dataaccess = (DaoTemplate<T, ID>) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> getAll(Session session) throws SQLException {
        return dataaccess.getAll(session);
    }

    @Override
    public T getBy(ID id, Session session) throws SQLException {
        return dataaccess.getBy(id, session);
    }

    @Override
    public void delete(ID id, Session session) throws SQLException {
        dataaccess.delete(id, session);
    }

    @Override
    public void update(T entity, Session session) throws SQLException {
        dataaccess.update(entity, session);
    }

    @Override
    public void create(T entity, Session session) throws SQLException {
        dataaccess.create(entity, session);
    }

}