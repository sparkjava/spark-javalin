package com.sparkjava;

import io.javalin.Context;
import io.javalin.Javalin;
import java.io.InputStream;
import java.util.concurrent.CompletableFuture;

public class Spark {

    private Javalin server = Javalin.create().disableStartupBanner().start(4567);

    public void get(String path, Route route) {
        server.get(path, ctx -> setResult(route, ctx));
    }

    public void post(String path, Route route) {
        server.get(path, ctx -> setResult(route, ctx));
    }

    private void setResult(Route route, Context ctx) throws Exception {
        Object result = route.handle(new Request(ctx), new Response(ctx));
        if (result instanceof CompletableFuture) {
            ctx.result((CompletableFuture<?>) result);
        } else if (result instanceof InputStream) {
            ctx.result((InputStream) result);
        } else if (result instanceof String) {
            ctx.result((String) result);
        }
    }

}
