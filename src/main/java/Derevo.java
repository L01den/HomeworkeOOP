public class Derevo {

    public static void main(String[] args) {

        People people2 = new People("Алена", "жен");
        People people3 = new People("Евгений","муж");
        People people1 = new People("Костя", people2, people3, "муж");
        Research a = new Research();
        System.out.println(a.getMother(people1));
    }

}


class People {
    private String name;
    private People mother;
    private People father;
    private String sex;

    public People(String name, People mother, People father, String sex) {
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.sex = sex;
    }
    //    public People(String name, People parent, String sex) {
//        if (sex == "муж") {
//            this(name, null, parent, sex);
//        } else {
//            this(name, mother, null, sex);
//        }
//    }
    public People(String name, String sex) {
        this(name, null, null , sex);
    }

    public String getName() {
        return this.name;
    }
    public String getParent() {
        return String.format("Ребенок - %s, Мама - %s, Папа - %s",
                this.name, this.mother.name, this.father.name);
    }



}
class Research {
    public String getMother(People obj) {
        return obj.getParent();
    }
}


//    HomeworkeOOP.People alena = new HomeworkeOOP.People("Алена", "Петрова",'f');
//    HomeworkeOOP.People evgenii = new HomeworkeOOP.People("Евгений", "Петров",'m');
//    HomeworkeOOP.People kostia = new HomeworkeOOP.People("Костя", "Голубев",'m');
//    HomeworkeOOP.People masha = new HomeworkeOOP.People("Мария", "Петрова", 'f');
//    HomeworkeOOP.People shasha = new HomeworkeOOP.People("Александр", "Сидоров",'m');
//    HomeworkeOOP.People rita = new HomeworkeOOP.People("Рита", "Абрамова", 'f');