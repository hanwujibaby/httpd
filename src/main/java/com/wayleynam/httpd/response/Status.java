package com.wayleynam.httpd.response;

/**
 * Created by wei4liverpool on 9/29/16.
 */
public enum Status implements IStatus {
    SWITCH_PROTOCOL(101,"Switching Protocols"),
    OK(200,"OK"),
    CREATED(201,"Created"),
    ACCEPTED(202,"Accepted"),
    Non_Authoritative_Information(203,"Non-Authoritative Information"),
    NO_CONTENT(204,"No Content"),
    Reset_Content(205,"Reset Content"),
    Partial_Content(206,"Partial Content"),


    REDIRECT(301,"Moved Permanently"),
    FOUND(302,"Found"),
    REDIRECT_SEE_OTHER(303,"REDIRECT_SEE_OTHER"),
    NOT_MODIFIED(304,"NOT_MODIFIED"),
    TEMPORARY_REDIRECT(307,"TEMPORARY_REDIRECT"),

    BAD_REQUEST(400,"BAD_REQUEST"),
    UNAUTHORIZED(401,"UNAUTHORIZED"),
    FORBIDDEN(403,"FORBIDDEN"),
    NOT_FOUND(404,"NOT_FOUND"),
    METHOD_NOT_ALLOWED(405,"METHOD_NOT_ALLOWED"),
    NOT_ACCEPTABLE(406,"NOT_ACCEPTABLE"),
    REQUEST_TIMEOUT(408,"REQUEST_TIMEOUT"),
    CONFLICT(409,"CONFLICT"),
    GONE(410,"GONE"),
    LENGTH_REQUIRED(411,"LENGTH_REQUIRED"),
    PRECONDITION_FAILED(412,"PRECONDITION_FAILED"),
    PAYLOAD_TOO_LARGE(413,"PAYLOAD_TOO_LARGE"),
    UNSUPPORTED_MEDIA_TYPE(415,"UNSUPPORTED_MEDIA_TYPE"),
    RANGE_NOT_SATISFIABLE(416,"RANGE_NOT_SATISFIABLE"),
    EXPECTATION_FAILED(417,"EXPECTATION_FAILED"),
    TOO_MANY_REQUESTS(419,"TOO_MANY_REQUESTS"),

    INTERNAL_ERROR(500,"INTERNAL_ERROR"),
    NOT_IMPLEMENTED(501,"NOT_IMPLEMENTED"),
    SERVICE_UNAVAILABLE(503,"SERVICE_UNAVAILABLE"),
    UNSUPPORTED_HTTP_VERSION(505,"UNSUPPORTED_HTTP_VERSION")
    ;

    private final int requestStatus;

    private final String description;

    Status(int requestStatus,String descrition){
        this.requestStatus=requestStatus;
        this.description=descrition;
    }


    public static Status lookup(int requestStatus){
        for(Status status:Status.values()){
            if(status.requestStatus==requestStatus){
                return status;
            }
        }
        return null;
    }

    @Override
    public String getDescription() {
        return ""+this.requestStatus+"==>"+this.description;
    }

    @Override
    public int getRequestStatus() {
        return this.requestStatus;
    }
}
