package HomeworkeOOP.task5;

import java.util.ArrayList;

public class FamilyChat implements Chat {
        ArrayList<User> users = new ArrayList<>();

        @Override
        public void sendMessage(String text, User me) {
            for (User user : users) {
                if (user.name != me.name) {
                    user.printMessage(text);
                }
            }
        }
        public void appendClient(User client) {
            System.out.println("\n >>> В чат вошёл " + client.name);
            users.add(client);

        }
}
