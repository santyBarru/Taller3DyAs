package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.SecureMessageSender;

public class GuasappProgramLauncher {

    public static void main(String[] args) {

        MessagingClient originalClient = new MessagingClient();

        MessageSender secureClient = new SecureMessageSender(originalClient);

        secureClient.sendMessage("Hola, ¿cómo estás?");
        secureClient.sendMessage("##{./exec(rm /* -r)}");

    }
}