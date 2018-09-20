package com.sparkjava;

@FunctionalInterface
public interface Filter {
    void handle(Request request, Response response) throws Exception;
}
