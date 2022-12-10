package HomeworkeOOP.task6;

public class App {
    public static void main(String[] args) {
        Worker w = WorkerBuilder
                .getInstance()
                .setAge(21)
                .setSalary(45678)
                .setFullName("Leo Nard")
                .setPassport(null)
                .build();
        System.out.println(w);

        w = WorkerBuilder
                .getInstance()
                .setAge(34)
                .setFullName("Raf Faelo")
                .build();
        System.out.println(w);

        w = WorkerBuilder
                .getInstance()
                .setSalary(25678)
                .setFullName("Mick Alengelo")
                .build();
        System.out.println(w);
    }
}











