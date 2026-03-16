package edu.unisabana.dyas.patterns.util;

public class SecureMessageSender implements MessageSender {

    private MessageSender client;

    public SecureMessageSender(MessageSender client) {
        this.client = client;
    }

    @Override
    public void sendMessage(String message) {

        if (message.contains("##{./exec")) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            client.sendMessage(message);
        }
    }
}