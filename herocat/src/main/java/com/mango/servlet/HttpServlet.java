package com.mango.servlet;

/**
 * @author mango
 * @version 1.0
 * @description TODO
 * @date 5/19/2023 5:18 PM
 */
public abstract class HttpServlet {

    public abstract void doGet(MangoHttpRequest request, MangoHttpResponse response) throws Exception;

    public abstract void doPost(MangoHttpRequest request, MangoHttpResponse response) throws Exception;

}
