package com.wayleynam.httpd.com.wayleynam.httpd.http.protocols;

import java.io.OutputStream;

/**
 * Created by wei4liverpool on 11/13/16.
 */
public interface ITempFile {
    public void delete() throws  Exception;

    public String getFileName();

    public OutputStream open() throws Exception;

}
