package com.logicbig;

import msg.provider.swingclass.Vertx;

import java.util.List;
import java.util.ServiceLoader;

public class AppMain {
    public static void main(String[] args) {
        Vertx vertx = ServiceLoader.load(Vertx.class).findFirst().get();
        vertx.showMessage("A test message");
    }
}
