package com.core.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionSystemException;

import com.core.exception.CoreException;

@Component
@Provider
public class TransactionSystemExceptionMapper extends AbstractExceptionMapper<TransactionSystemException> {

    @Override
    public Response toResponse(final TransactionSystemException paramE) {
        return Response.status(this.getStatus()).entity(this.getErrorMessages((CoreException) paramE.getApplicationException())).build();
    }

    @Override
    protected Status getStatus() {
        return Status.INTERNAL_SERVER_ERROR;
    }

}
