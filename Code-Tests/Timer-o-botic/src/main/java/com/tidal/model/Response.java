package com.tidal.model;

/**
 * Created by adak on 1/31/2020.
 */
public class Response<T> {
    ResponseStatus responseStatus;
    T result;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
