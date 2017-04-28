package com.tenxcloud.listen;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpServer;

/**
 * Created by rd on 17-4-26.
 */
public class HttpListen extends AbstractVerticle {
    private static final String HELLO_GRADLE = "hello gradle!";
    private static final String LENGTH = HELLO_GRADLE.length() + "";

    @Override
    public void start(Future<Void> start) throws Exception {
        HttpServer server = vertx.createHttpServer();
        server.requestHandler(handler -> {
            System.out.println("接收到请求..");
            handler.response().putHeader(HttpHeaders.CONTENT_LENGTH, LENGTH).write(HELLO_GRADLE).end();
        }).listen(8989, "0.0.0.0", res -> {
            if (res.failed()) {
                System.out.println("监听失败...");
                return;
            }
            System.out.println("0.0.0.0:8989成功");
        });
        super.start(start);
    }
}
