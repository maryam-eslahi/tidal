package com.tidal.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class ResponseStatus {
   private String message;
   private ErrorCode code;

    public ResponseStatus() {

    }

    public ResponseStatus(String Message, ErrorCode Code) {
        this.message = Message;
        this.code = Code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorCode getCode() {
        return code;
    }

    public void setCode(ErrorCode code) {
        this.code = code;
    }

   }
