
package com.airport.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.QueryParameters;
import com.core.dao.RelationalRepository;
import com.core.exception.PersistenceException;
import com.core.exception.ServiceException;
import com.core.service.BaseServiceImpl;

import com.airport.model.domain.UserMaster;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {
 private static final Logger LOG = Logger.getLogger(UserServiceImpl.class);
	
    @Autowired
    public UserServiceImpl(final RelationalRepository relationalRepository) {
        super.relationalRepository = relationalRepository;
    }
    
	@Override
    @Transactional
	public long register(UserMaster user) throws ServiceException {
		LOG.debug("create UserMaster :: START");
		long userId = 0;
		try {
		    final UserMaster newUser = relationalRepository.create(user);
		    userId = newUser.getUserId();
		} catch (final PersistenceException pe) {
		    LOG.error(pe);
		    throw new ServiceException(pe.getErrorMessages());
		}
		LOG.debug("create UserMaster :: END");
		return userId;	
		
	}  
        @Override
	@Transactional
	public void update(UserMaster user) throws ServiceException {
		LOG.debug("update UserMaster :: START");
		try {
			
		    relationalRepository.update(user);
		} catch (final PersistenceException pe) {
		    LOG.error(pe);
		    throw new ServiceException(pe.getErrorMessages());
		}
		LOG.debug("update UserMaster :: END");

	}
        
        @Override
	@Transactional
	public void delete(long id) throws ServiceException {
		LOG.debug("delete UserMaster :: START");
		try {
			UserMaster user  = get(id);
			if (user != null) {
				relationalRepository.remove(user);
			}
		} catch (final PersistenceException pe) {
		    LOG.error(pe);
		    throw new ServiceException(pe.getErrorMessages());
		}
		LOG.debug("delete UserMaster :: END");

	}
        @Override
	public UserMaster get(long id) throws ServiceException {
		try {
		    final UserMaster user = relationalRepository.find(id,UserMaster.class);
		    return user;
		} catch (final PersistenceException pe) {
		    LOG.error(pe);
		    throw new ServiceException(pe.getErrorMessages());
		}
	}


}
