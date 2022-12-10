package HomeworkeOOP.task6;

public class ProxyPassport {
    Passport passport;

    public Passport getPassport() {
        return passport;
    }

    public ProxyPassport(Passport arg) {
        if (arg != null) {
            this.passport = arg;
        } else {
            this.passport = new NilPassopr();
        }
    }
}
