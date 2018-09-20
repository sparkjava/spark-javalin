package com.sparkjava;

public class HelloWorld {

    public static void main(String[] args) {

        Spark spark = new Spark();

        spark.get("/", (req, res) -> "Hello");

        spark.get("/redirect", (req, res) -> "Hello " + res.redirect("/Spark"));

        spark.get("/:name", (req, res) -> "Hello " + req.pathParam("name"));

    }

}
