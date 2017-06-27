package com.core.exception.mapper;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.core.exception.InvalidDataException;

@Component
@Provider
public class InvalidDataExceptionMapper extends AbstractExceptionMapper<InvalidDataException> {

    @Override
    protected Status getStatus() {
        return Status.BAD_REQUEST;
    }

}
