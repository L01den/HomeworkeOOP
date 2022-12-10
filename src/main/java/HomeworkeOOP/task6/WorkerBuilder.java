package HomeworkeOOP.task6;

public class WorkerBuilder {
    private static WorkerBuilder instance;

    Worker obj;

    public static WorkerBuilder getInstance() {
        if (instance == null) {
            instance = new WorkerBuilder();
        }
        instance.obj = new Worker();
        return instance;
    }

    private WorkerBuilder() {
    }

    public WorkerBuilder setAge(int age) {
        obj.age = age;
        return this;
    }

    public WorkerBuilder setSalary(int salary) {
        obj.salary = salary;
        return this;
    }

    public WorkerBuilder setFullName(String fullName) {
        obj.fullName = fullName;
        return this;
    }

//    public HomeworkeOOP.task6.WorkerBuilder setPassport(int n, int s) {
//        obj.passport = new HomeworkeOOP.task6.Passport(n, s);
//        return this;
//    }

    public WorkerBuilder setPassport(Passport p) {
        obj.passport = new ProxyPassport(p).getPassport();
        return this;
    }

    public Worker build() {
        return obj;
    }
}