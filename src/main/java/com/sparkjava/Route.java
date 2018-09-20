package com.sparkjava;

@FunctionalInterface
public interface Route {
    Object handle(Request request, Response response) throws Exception;
}
