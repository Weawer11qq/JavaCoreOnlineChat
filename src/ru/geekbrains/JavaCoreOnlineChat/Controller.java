package ru.geekbrains.JavaCoreOnlineChat;

public interface Controller {
    void sendMessage(String msg);

    void closeConnection();

    void showUI(ClientUI clientUI);
}