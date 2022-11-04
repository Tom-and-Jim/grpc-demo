package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            HelloWorldServer server = new HelloWorldServer();
            server.start();
        } catch (Exception e) {
            System.out.println("Starting server failed.");
        }

        HelloWorldClient client = new HelloWorldClient();
        client.greet("qinchao.xu");
    }
}