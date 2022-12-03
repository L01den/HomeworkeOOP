package HomeworkeOOP.task3;

public class Node {

    public Node(People p1, Relationship re, People p2) {
        this.per1 = p1;
        this.re = re;
        this.per2 = p2;
    }

    People per1;
    Relationship re;
    People per2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", per1, re, per2);
    }
}