package com.core.exception.mapper;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.core.exception.ConditionFailedException;

@Component
@Provider
public class ConditionFailedExceptionMapper extends AbstractExceptionMapper<ConditionFailedException> {

    @Override
    protected Status getStatus() {
        return Status.PRECONDITION_FAILED;
    }

}
