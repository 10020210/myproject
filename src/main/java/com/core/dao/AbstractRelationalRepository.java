package com.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import com.core.exception.ErrorDescription;
import com.core.exception.PersistenceException;

/**
 * DAO for basic CRUD operations
 */
public abstract class AbstractRelationalRepository {

    private static final Logger LOG = Logger.getLogger(AbstractRelationalRepository.class);

    protected EntityManager entityManager;

    public <T> T create(final T entity) throws PersistenceException {
        LOG.debug("create entity :: START");
        try {
            this.entityManager.persist(entity);
        } catch (final Exception pe) {
            LOG.error(pe);
            throw new PersistenceException(ErrorDescription.COULD_NOT_PROCEED);
        }
        LOG.debug("create entity :: END ");
        return entity;
    }

    public <T> T find(final Object primaryKey, final Class<T> entityClass) throws PersistenceException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("find [ " + entityClass + "] :: START");
        }
        final T result;
        try {
            result = this.entityManager.find(entityClass, primaryKey);
        } catch (final javax.persistence.PersistenceException pe) {
            LOG.error(pe);
            throw new PersistenceException(ErrorDescription.COULD_NOT_PROCEED);
        }
        if (LOG.isDebugEnabled()) {
            LOG.debug("find [ " + entityClass + "] :: END");
        }
        return result;
    }

    public <T> T find(final String queryName, final QueryParameters queryParams, final Class<T> resultClass) throws PersistenceException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("find [ " + queryName + "] :: START");
        }
        try {
            final TypedQuery<T> query = this.entityManager.createNamedQuery(queryName, resultClass);
            query.setFlushMode(FlushModeType.COMMIT);

            queryParams.fill(query);

            final T result = query.getSingleResult();
            if (LOG.isDebugEnabled()) {
                LOG.debug("find [ " + queryName + "] :: END");
            }
            return result;
        } catch (final NoResultException nre) {
            return null;
        } catch (final javax.persistence.PersistenceException pe) {
            LOG.error(pe);
            throw new PersistenceException(ErrorDescription.COULD_NOT_PROCEED);
        }
    }

    public <T> List<T> list(final String queryName, final QueryParameters queryParams, final Class<T> resultClass) throws PersistenceException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("list [ " + queryName + "] :: START");
        }
        try {
            final TypedQuery<T> query = this.entityManager.createNamedQuery(queryName, resultClass);
            query.setFlushMode(FlushModeType.COMMIT);

            if (queryParams != null) {
                queryParams.fill(query);
            }

            final List<T> results = query.getResultList();
            if (LOG.isDebugEnabled()) {
                LOG.debug("list [ " + queryName + "] :: END");
            }
            return results;
        } catch (final javax.persistence.PersistenceException pe) {
            LOG.error(pe);
            throw new PersistenceException(ErrorDescription.COULD_NOT_PROCEED);
        }
    }

    public <T> List<T> list(final String queryName, final QueryParameters queryParams, final int limit, final Class<T> resultClass) throws PersistenceException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("list [ " + queryName + "] :: START");
        }
        try {
            final TypedQuery<T> query = this.entityManager.createNamedQuery(queryName, resultClass);
            queryParams.fill(query);

            query.setMaxResults(limit);
            query.setFlushMode(FlushModeType.COMMIT);

            final List<T> results = query.getResultList();

            if (LOG.isDebugEnabled()) {
                LOG.debug("list [ " + queryName + "] :: END");
            }
            return results;
        } catch (final javax.persistence.PersistenceException pe) {
            LOG.error(pe);
            throw new PersistenceException(ErrorDescription.COULD_NOT_PROCEED);
        }
    }

    public <T> T update(final T entity) throws PersistenceException {
        LOG.debug("update Entity :: START");
        try {
            this.entityManager.merge(entity);
        } catch (final Exception pe) {
            LOG.error(pe);
            throw new PersistenceException(ErrorDescription.COULD_NOT_PROCEED);
        }
        LOG.debug("update entity :: END ");
        return entity;
    }

    public void remove(final Object entity) throws PersistenceException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("remove [ " + entity + "] :: START");
        }
        try {
            this.entityManager.remove(entity);
            if (LOG.isDebugEnabled()) {
                LOG.debug("remove [ " + entity + "] :: END");
            }
        } catch (final Exception e) {
            LOG.error(e);
            throw new PersistenceException(ErrorDescription.COULD_NOT_PROCEED);
        }
    }

    public void remove(final String queryName, final QueryParameters queryParams) throws PersistenceException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("remove [ " + queryName + "] :: START");
        }
        try {
            final Query query = this.entityManager.createNamedQuery(queryName);
            queryParams.fill(query);
            query.executeUpdate();
            if (LOG.isDebugEnabled()) {
                LOG.debug("remove [ " + queryName + "] :: END");
            }
        } catch (final Exception pe) {
            LOG.error(pe);
            throw new PersistenceException(ErrorDescription.COULD_NOT_PROCEED);
        }
    }
}
