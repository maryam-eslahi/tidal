package com.tidal.exceptions;
import com.tidal.model.*;
import javax.ws.rs.core.Response;
//import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

    @Override
    public Response toResponse(DataNotFoundException ex) {
        ResponseStatus responseStatus = new ResponseStatus(ex.getMessage(), ErrorCode.NOTFOUND);
        return Response.status(Response.Status.NOT_FOUND)
                .entity(responseStatus)
                .build();
    }
}
