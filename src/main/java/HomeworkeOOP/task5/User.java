package HomeworkeOOP.task5;

public class User {
    public User(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    public User(String name) {
        this.name = name;
    }

    String name;
    private Chat chatroom;

    void printMessage(String msg) {
        System.out.printf("Чат: %s: %s\n", name, msg);
    }

    void sendMsg(String text) {
        chatroom.sendMessage(text, this);
    }
}

