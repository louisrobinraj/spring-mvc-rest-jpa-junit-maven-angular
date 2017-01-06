package com.sjc.hrms.core.persistence;

import java.util.List;

public interface JpaDAO<EntityType> {

	public EntityType findOne(String ID);
	
	public EntityType findByName(String name);
	
	public void delete(EntityType e);

	public List<EntityType> findAll();
	
	public void delete(List<EntityType> entities);

	public void deleteAll();

	public EntityType saveAndFlush(EntityType entity);

	public EntityType saveOrUpdate(EntityType entity);

}
