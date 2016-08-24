package me.frame.base;

import java.util.List;

public interface BaseDao<T> {
	
	public int insert(T t);
	public int delete(T t);
	public int update(T t);
	public T get(String id);
	public T get(T t);
	public List<T> findList(T t);
	public List<T> findAllList(T t);
}
