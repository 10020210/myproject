package com.core.exception.mapper;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.core.exception.ServiceException;

@Component
@Provider
public class ServiceExceptionMapper extends AbstractExceptionMapper<ServiceException> {

    @Override
    protected Status getStatus() {
        return Status.INTERNAL_SERVER_ERROR;
    }

}
