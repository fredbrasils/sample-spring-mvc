package com.sample.service.impl;

import java.util.List;

import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.service.BaseService;

@MappedSuperclass
public abstract class BaseServiceImpl<T> implements BaseService<T>{
	
	private JpaRepository<T, Long> baseRepository;
	 
	public void setBaseRepository(JpaRepository<T, Long> baseRepository) {
		this.baseRepository = baseRepository;
	}
	
	public JpaRepository<T, Long> getBaseRepository() {
		return baseRepository;
	}
	
	@Override
	public void save(T entity) {
		baseRepository.save(entity);
	}
	
	@Override
	public void delete(T entity){
		baseRepository.delete(entity);		
	}
	

	@Override
	public List<T> findAll() {
		return baseRepository.findAll();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T findById(Long id) {
		
		T entity = null;
		
		try {
			entity = (T) baseRepository.findById(id);
		}catch (Exception e) {}
		
		return entity;
	}

	@Override
	public void saveAll(List<T> entity) {
		baseRepository.saveAll(entity);
	}

	@Override
	public void saveAndFlush(T entity) {
		baseRepository.saveAndFlush(entity);		
	}

	@Override
	public void deleteAll() {
		baseRepository.deleteAll();
	}

	@Override
	public void deleteById(Long id) {
		baseRepository.deleteById(id);
	}
	
}
