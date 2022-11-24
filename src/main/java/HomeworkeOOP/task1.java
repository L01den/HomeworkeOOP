package HomeworkeOOP;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        People alena = new People("Алена", "Петрова",'f');
        People evgenii = new People("Евгений", "Петров",'m');
        People kostia = new People("Костя", "Голубев",'m');
        People masha = new People("Мария", "Петрова", 'f');
        People shasha = new People("Александр", "Сидоров",'m');
        People rita = new People("Рита", "Абрамова", 'f');

        GeoTree gt = new GeoTree();
        gt.append(alena, masha);
        gt.append(evgenii, masha);
        gt.append(rita, kostia);
        gt.append(rita, alena);
        gt.append(rita, shasha);

        gt.printRelatives("parent");

        System.out.println(new Research(gt).spend(rita, Relationship.parent));
        System.out.println(new Research(gt).mother(alena, Relationship.children));
        System.out.println(new Research(gt).father(masha, Relationship.children));

        gt.printRelatives("children");
        


    }
}
class People{
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
    public String toString() {
        return String.format("Name - %s %s, Sex - %s" , surname, firstname, sex);
    }
}

enum Relationship {
    parent,
    children
}

class Node {

    public Node(People p1, Relationship re, People p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    People p1;
    Relationship re;
    People p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
}

interface Tree {
    void append(People parent, People children);

    ArrayList<Node> getData();
}

class GeoTree implements Tree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getData() {
        return tree;
    }

    public ArrayList<Node> printRelatives(String whoToShow) {
        int i;
        if(whoToShow == "children") {
            i = 1;
        } else {
            i = 0;
        }
        while (i < tree.size()) {
            System.out.println(tree.get(i));
            i += 2;
        }

        return null;
    }

    public ArrayList<Node> printRelatives() {
        for (int i = 0; i < tree.size(); i++) {
            System.out.println(tree.get(i));
        }
        return null;
    }

    public void append(People parent, People children) {

        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
}


class Research {
    ArrayList<Node> tree;

    public Research(Tree pd) {
        tree = pd.getData();
    }

    public ArrayList<People> spend(People p, Relationship re) {
        var result = new ArrayList<People>();

        for (Node t : tree) {
            if (t.p1.getFirstname() == p.getFirstname()
                    && t.re == re) {
                result.add(t.p2);
            }
        }

        return result;
    }

    public ArrayList<People> father(People p, Relationship re) {
        var result = new ArrayList<People>();

        for (Node t : tree) {
            if (t.p1.getFirstname() == p.getFirstname()
                    && t.re == re
                    && t.p2.getSex() =='m') {
                result.add(t.p2);
            }
        }

        return result;
    }

    public ArrayList<People> mother(People p, Relationship re) {
        var result = new ArrayList<People>();

        for (Node t : tree) {
            if (t.p1.getFirstname() == p.getFirstname()
                    && t.re == re
                    && t.p2.getSex() =='f') {
                result.add(t.p2);
            }
        }

        return result;
    }
}
