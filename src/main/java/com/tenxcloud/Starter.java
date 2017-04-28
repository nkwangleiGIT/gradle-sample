package com.tenxcloud;

import io.vertx.core.Vertx;
import com.tenxcloud.listen.HttpListen;

/**
 * Created by rd on 17-4-26.
 */
public class Starter {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new HttpListen());
    }
}