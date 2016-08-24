package me.frame.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public abstract class BaseService<D extends BaseDao<T>, T extends BaseEntity<T>>{

	@Autowired
	D dao;
	
	@Transactional(readOnly = false)
	public int insert(T t) {
		return dao.insert(t);
	}
	@Transactional(readOnly = false)
	public int delete(T t) {
		return dao.delete(t);
	}
	@Transactional(readOnly = false)
	public int update(T t) {
		return dao.update(t);
	}
	public T get(String id) {
		return dao.get(id);
	}
	public T get(T t) {
		return dao.get(t);
	}
	public List<T> findList(T t) {
		return dao.findList(t);
	}
	public List<T> findAllList() {
		return dao.findAllList(null);
	}
	public List<T> findAllList(T t) {
		return dao.findAllList(t);
	}
	
}
