package ru.job4j.bmb;
/**
 *  закоментирован непонятный импорт import ru.job4j.bmb.model.Message;
 */

import ru.job4j.bmb.content.Content;
import ru.job4j.bmb.services.BotCommandHandler;
import ru.job4j.bmb.services.TelegramBotService;

public class DIByDirectInjectMain {
    public static void main(String[] args) {
        var handler = new BotCommandHandler();
        var tg = new TelegramBotService(handler);
        tg.content(new Content());
    }
}