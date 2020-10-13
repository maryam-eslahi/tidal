package com.tidal.exceptions;

import com.tidal.model.ErrorCode;
import com.tidal.model.ResponseStatus;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

public class GenericExceptionMapper {

    @Provider
    public class DataNotFoundExceptionMapper implements ExceptionMapper<Throwable> {

        @Override
        public Response toResponse(Throwable ex) {
            ResponseStatus responseStatus = new ResponseStatus(ex.getMessage(), ErrorCode.FAIL);
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(responseStatus)
                    .build();
        }
    }
}