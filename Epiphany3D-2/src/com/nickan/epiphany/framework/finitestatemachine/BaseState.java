package com.nickan.epiphany.framework.finitestatemachine;

import com.nickan.epiphany.framework.finitestatemachine.messagingsystem.Message;

/**
 * The interface for the state of the entity
 * @author Nickan
 *
 * @param <EntityType> - The type of entity
 */
public interface BaseState<EntityType> {
	
	public abstract void start(EntityType entity);
	
	public abstract void update(EntityType entity, float delta);
	
	public abstract void exit(EntityType entity);
	
	public abstract boolean handleMessage(EntityType entity, Message message);
	
	/**
	 * 
	 * 
	 * @return - The name of the state
	 */
	public abstract String getStatus();
	
}
