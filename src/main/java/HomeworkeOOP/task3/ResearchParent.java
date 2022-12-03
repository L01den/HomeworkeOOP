package HomeworkeOOP.task3;

import java.util.ArrayList;

class ResearchParent extends Research {

    public ResearchParent(Tree pd) {
        super(pd);
    }
    public ArrayList<People> spend(People p, Relationship re) {
        var result = new ArrayList<People>();

        for (Node t : tree) {
            if (t.per1.getFirstname() == p.getFirstname()
                    && t.re == re) {
                result.add(t.per2);
            }
        }

        return result;
    }

    public ArrayList<People> mother(People p) {
        var result = new ArrayList<People>();

        for (Node t : tree) {
            if (t.per1.getFirstname() == p.getFirstname()
                    && t.re == Relationship.CHILDREN
                    && t.per2.getSex() =='f') {
                result.add(t.per2);
            }
        }

        return result;
    }

    public ArrayList<People> fatser(People p) {
        var result = new ArrayList<People>();

        for (Node t : tree) {
            if (t.per1.getFirstname() == p.getFirstname()
                    && t.re == Relationship.CHILDREN
                    && t.per2.getSex() =='m') {
                result.add(t.per2);
            }
        }
        return result;
    }
}
