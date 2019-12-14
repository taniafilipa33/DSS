package DAO;

import java.util.List;

public interface DAO<T> {
    public T get(String id);
    public T get(int id);
    public List<T> getAll();
    void save(T t);
    void update(T t);
    void delete(T t);
}
