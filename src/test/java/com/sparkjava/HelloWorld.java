package com.sparkjava;

public class HelloWorld {

    public static void main(String[] args) {

        Spark spark = new Spark();

        spark.before("*", (req, res) -> System.out.println(req.url()));

        spark.before("/redirect", (req, res) -> res.redirect("/Spark"));
        spark.get("/redirectNr2", (req, res) -> res.redirect("/Spark"));

        spark.get("/", (req, res) -> "Hello");

        spark.get("/:name", (req, res) -> "Hello " + req.pathParam("name"));

    }

}
