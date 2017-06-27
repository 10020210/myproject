package com.core.exception.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import com.core.common.utils.ResourceBundleUtil;
import com.core.exception.ErrorMessage;
import com.core.exception.CoreException;

public abstract class AbstractExceptionMapper<E extends Throwable> implements ExceptionMapper<E> {

    @Override
    public Response toResponse(final E paramE) {
        return Response.status(this.getStatus()).entity(ResourceBundleUtil.getValidationMessages(this.getErrorMessages((CoreException) paramE))).build();
    }

    protected final List<ErrorMessage> getErrorMessages(final CoreException ie) {
        List<ErrorMessage> msg = new ArrayList<ErrorMessage>();
        if (ie != null) {
            msg = ie.getErrorMessages();
        }
        if (msg.isEmpty()) {
            msg.add(new ErrorMessage("global.server.error", "global.contact.csr"));
        }
        return msg;
    }

    protected abstract Status getStatus();
}
