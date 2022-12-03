package HomeworkeOOP.task3;

import java.util.ArrayList;

abstract class Research {
    ArrayList<Node> tree;
    public Research(Tree pd) {
        tree = pd.getData();
    }
}

