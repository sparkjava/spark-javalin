package com.sparkjava;

import io.javalin.Context;

public class Request {

    private Context ctx;

    public Request(Context ctx) {
        this.ctx = ctx;
    }

    String pathParam(String key) {
        return ctx.pathParam(key);
    }
}
