package com.core.exception.mapper;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.core.exception.NotFoundException;

@Component
@Provider
public class NotFoundExceptionMapper extends AbstractExceptionMapper<NotFoundException> {

    @Override
    protected Status getStatus() {
        return Status.NOT_FOUND;
    }

}
