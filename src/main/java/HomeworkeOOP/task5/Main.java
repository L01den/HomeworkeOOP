package HomeworkeOOP.task5;

import java.util.ArrayList;

public class Main {

// chat icq = new chatroom();

    public static void main(String[] args) {
        FamilyChat fMsg = new FamilyChat();
        User client1 = new User("Вася", fMsg);
        User client2 = new User("Андрей", fMsg);
        User client4 = new User("Марина", fMsg);
        User client5 = new User("Маша", fMsg);
        fMsg.appendClient(client1);
        fMsg.appendClient(client2);
        fMsg.appendClient(client4);

        client1.sendMsg("Привет, всем!");
        client2.sendMsg("Хай!");
        User client3 = new User("Олег", fMsg);
        fMsg.appendClient(client3);

        client3.sendMsg("hello world!");

        User client6 = new User("Вася");
        User client7 = new User("Андрей");

        PrivatChat pc = new PrivatChat(client6, client7);

        pc.sendMessage("Hi!", client6);
        pc.sendMessage("Hello)", client7);
    }
}
