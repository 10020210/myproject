package com.core.exception.mapper;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.core.exception.UniqueConstraintException;

@Component
@Provider
public class UniqueConstraintExceptionMapper extends AbstractExceptionMapper<UniqueConstraintException> {

    @Override
    protected Status getStatus() {
        return Status.CONFLICT;
    }

}
