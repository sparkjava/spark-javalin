package com.sparkjava;

import io.javalin.Context;

public class Response {
    private Context ctx;

    public Response(Context ctx) {
        this.ctx = ctx;
    }

    public Object redirect(String location) {
        ctx.redirect(location);
        return "";
    }

}
