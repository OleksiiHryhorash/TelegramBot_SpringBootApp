package org.example.controller;


import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.annotation.PostConstruct;

@Component
@Log4j
public class TelegramBot extends TelegramLongPollingBot {

    //name of telegram bot
    @Value("${bot.name}")
    private String botName;

    //unique bot token
    @Value("${bot.token}")
    private String botToken;

    private UpdateController updateController;

    //establishing a connection with the controller
    public TelegramBot(UpdateController updateController) {
        this.updateController = updateController;
    }

    //registration current obj of telegram bot
    @PostConstruct
    public void init(){
        updateController.registerBot(this);
    }


    //method which send and get messages
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        updateController.processUpdate(update);
    }

    //check sending answer for NULL
    public void sendAnswerMessage(SendMessage message) {
        if (message != null) {
            try {
                execute(message);
            } catch (TelegramApiException e) {
                log.error(e);
            }
        }
    }

    // ----------- get connection with telegram bot
    @Override
    public String getBotToken() {
        return botToken;
    }
    @Override
    public String getBotUsername() {
        return botName;
    }
    // --------------------------------------------
}
