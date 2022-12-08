package HomeworkeOOP.task5;

import java.util.ArrayList;

public class PrivatChat implements Chat{

    User user1;
    User user2;
    public PrivatChat(User user1, User user2){
        this.user1 = user1;
        this.user2 = user2;
    }
    @Override
    public void sendMessage(String text, User user) {
                if(user.name == user1.name){
                    System.out.println("У " + user2.name + " новое сообщение ↓↓↓\n" +
                                                                      "\t>>> " + text);
                } else{
                    System.out.println("У " + user1.name + " новое сообщение ↓↓↓ \n" +
                                                                        "\t>>> " + text);
                }

    }

}
