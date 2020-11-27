package ua.lviv.iot.model.dao;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;

@SuppressWarnings({ "unchecked", "rawtypes" })
public abstract class AbstractBaseDao<T, ID> implements DaoTemplate<T, ID> {

    private final Class<T> currentClass;

    public AbstractBaseDao(Class<T> currentClass) {
        this.currentClass = currentClass;
    }

    @Override
    public List<T> getAll(Session session) throws SQLException {
        List<T> entities = new LinkedList<>();
        Query query = session.createQuery("FROM " + currentClass.getSimpleName().toLowerCase());
        for (Object entity : query.getResultList()) {
            entities.add((T) entity);
        }
        return entities;
    }

    @Override
    public T getBy(ID id, Session session) throws SQLException {
        return (T) session.get(currentClass, (Integer) id);
    }

    @Override
    public void delete(ID id, Session session) throws SQLException {
        session.beginTransaction();
        T deletedEntity = getBy(id, session);
        session.delete(deletedEntity);
        session.getTransaction().commit();
    }

    @Override
    public void update(T entity, Session session) throws SQLException {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
    }

    @Override
    public void create(T entity, Session session) throws SQLException {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

}