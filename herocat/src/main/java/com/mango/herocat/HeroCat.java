package com.mango.herocat;

public class HeroCat {
    public static void run(String[] args) throws Exception {

        HeroCatServer server = new HeroCatServer("com.mango.webapp");

        server.start();
    }
}
