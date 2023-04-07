package org.example.service.impl;

import org.example.dao.RawDataDAO;
import org.example.entity.RawDataForDB;
import org.example.service.MainService;
import org.example.service.ProducerService;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
@Service
public class MainServiceImpl implements MainService {
    private final RawDataDAO rawDataDAO;
    private final ProducerService producerService;

    public MainServiceImpl(RawDataDAO rawDataDAO, ProducerService producerService) {
        this.rawDataDAO = rawDataDAO;
        this.producerService = producerService;
    }

    @Override
    public void processTextMessage(Update update) {
        saveRawData(update);

        Message message = update.getMessage();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Your text message is received");
        producerService.produceAnswer(sendMessage);
    }

    private void saveRawData(Update update) {
        RawDataForDB rawDataForDB = RawDataForDB.builder()
                .event(update)
                .build();
        rawDataDAO.save(rawDataForDB);
    }
}
