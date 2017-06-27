package com.core.exception.mapper;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.core.exception.NotAvailableException;

@Component
@Provider
public class NotAvailableExceptionMapper extends AbstractExceptionMapper<NotAvailableException> {

    @Override
    protected Status getStatus() {
        return Status.GONE;
    }

}
