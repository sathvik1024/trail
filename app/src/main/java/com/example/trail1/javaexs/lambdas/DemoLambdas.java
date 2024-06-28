package com.example.trail1.javaexs.lambdas;

public class DemoLambdas {

    public static void main(String[] args) {
        //life before lamdas
        MessageImpl message = new MessageImpl();
        message.sendMessage();

        //life after lamdas
        IMessage iMessage = () -> {
            System.out.println("sending message from lambda");};
        iMessage.sendMessage();
    }
}
