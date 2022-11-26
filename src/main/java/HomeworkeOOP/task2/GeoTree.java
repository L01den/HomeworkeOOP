package HomeworkeOOP.task2;

import java.util.ArrayList;

public class GeoTree implements Tree {
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

        tree.add(new Node(parent, Relationship.PARENT, children));
        tree.add(new Node(children, Relationship.CHILDREN, parent));
    }
}
