package HomeworkeOOP.task6;

public class Worker {
    int age;
    int salary;
    String fullName;
    Passport passport;

    @Override
    public String toString() {
        return "Работник{" +
                "возраст - " + age +
                ", зп - " + salary +
                ", Uмя - '" + fullName +
                ", паспорт " + passport + '\'' +
                '}';
    }
}
