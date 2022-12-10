package HomeworkeOOP.task6;

public class Passport {
    int numder;
    int series;

    public Passport(int n, int s) {
        numder = n;
        series = s;
    }

    @Override
    public String toString() {
        return String.format("серия %d, номер %d", series, numder);
    }
}