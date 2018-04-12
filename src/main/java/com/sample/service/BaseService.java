package com.sample.service;

import java.util.List;

public interface BaseService<T> {

	public List<T> findAll();
	
	public T findById(Long id);

	public void save(T entity);
	
	public void saveAll(List<T> entity);
	
	public void saveAndFlush(T entity);
	
	public void delete(T entity);
	
	public void deleteAll();
	
	public void deleteById(Long id);
	
	
}
