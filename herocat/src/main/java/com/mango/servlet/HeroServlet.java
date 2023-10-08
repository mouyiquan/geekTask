package com.mango.servlet;

import java.io.IOException;

/**
 * 定义Servlet规范
 */
public abstract class HeroServlet {

    public abstract void doGet(HeroRequest request, HeroResponse response) throws Exception;

    public abstract void doPost(HeroRequest request, HeroResponse response) throws Exception;

    public abstract void doPut(HeroRequest request, HeroResponse response) throws Exception;

    public abstract void doDelete(HeroRequest request, HeroResponse response) throws Exception;
}
