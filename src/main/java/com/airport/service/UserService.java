package com.airport.service;

import java.util.List;

import com.core.exception.ServiceException;
import com.airport.model.domain.UserMaster;
public interface UserService {
public long register(UserMaster user) throws ServiceException;
	
	public void update(UserMaster user) throws ServiceException;
	
	public void delete (long id) throws ServiceException;
	 
	public UserMaster get(long id) throws ServiceException;

}