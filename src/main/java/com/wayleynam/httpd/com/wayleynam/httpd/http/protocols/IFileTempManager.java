package com.wayleynam.httpd.com.wayleynam.httpd.http.protocols;

/**
 * Created by wei4liverpool on 11/13/16.
 */
public interface IFileTempManager {

    public void clear();

    public ITempFile create(String filename_hint) throws Exception;
}
