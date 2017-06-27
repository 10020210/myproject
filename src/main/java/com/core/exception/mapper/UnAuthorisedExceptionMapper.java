package com.core.exception.mapper;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.core.exception.UnAuthorizedException;

@Component
@Provider
public class UnAuthorisedExceptionMapper extends AbstractExceptionMapper<UnAuthorizedException> {

    @Override
    protected Status getStatus() {
        return Status.UNAUTHORIZED;
    }
}
