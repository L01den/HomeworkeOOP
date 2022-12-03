package HomeworkeOOP.task3;

public class People implements Door {
    private String surname;
    private String firstname;
    private Character sex;

    public People(String firstname, String surname, Character sex) {
        this.surname = surname;
        this.firstname = firstname;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Character getSex() {
        return sex;
    }

    @Override
//    public String toString() {
//        return String.format("Name - %s %s, Sex - %s" , surname, firstname, sex);
//    }
    public String toString() {
        return String.format("Name - %s %s", surname, firstname);
    }

    @Override
    public void openDoor(People p) {
        System.out.println("Дверь открыта");
    }

    @Override
    public void closeDoor() {
        System.out.println("Дверь закрыта");
    }
}


