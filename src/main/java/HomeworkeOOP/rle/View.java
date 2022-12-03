package HomeworkeOOP.rle;

import java.util.*;

public class View {
    static Field f = new Field();

    public static void main(String[] args) {
        f.initFieldZero(10, 10);
        f.createField(20);
        int[][] arrayExit = {{7, 1}, {5, 7}, {1, 6}};
        for (int i = 0; i < arrayExit.length; i++) {
            f.editValue(arrayExit[i][0], arrayExit[i][1], 0);
        }

//        f.editValue(2, 5, -1);
//        f.editValue(3, 3, -1);
//        f.editValue(4, 3, -1);
//        f.editValue(6, 2, -1);
//        f.editValue(6, 1, -1);
//        f.editValue(1, 1, -1);
//        f.editValue(1, 2, -1);
//        f.editValue(1, 3, -1);
        int[][] arreySteps = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        Queue queueSteps = new LinkedList();
        queueSteps.add(new int[]{4, 4, 1});

        while (!queueSteps.isEmpty()) {
            int[] temp = (int[]) queueSteps.poll();
            f.editValue(temp[0], temp[1], temp[2]);
            temp[2]++;
            for (int i = 0; i < arreySteps.length; i++) {
                if (canPlace(temp[0] + arreySteps[i][0], temp[1] + arreySteps[i][1])) {
                    queueSteps.add(new int[]{temp[0] + arreySteps[i][0], temp[1] + arreySteps[i][1], temp[2]});
                }
            }
        }
        f.printField();

        List<List<Integer>> shortWay = new ArrayList<>();
        int [] exit = positionCloseExit(arrayExit);
        int lastMove = (f.setCell(exit[0], exit[1])) - 1;

        while (lastMove > 0){
            for (int i = 0; i < arreySteps.length; i++) {
                int move = f.setCell(exit[0] - arreySteps[i][0], exit[1] - arreySteps[i][1]);
                if ((lastMove) == move) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(exit[0] - arreySteps[i][0]);
                    temp.add(exit[1] - arreySteps[i][1]);
                    shortWay.add(temp);
                    lastMove--;
                    exit[0] = exit[0] - arreySteps[i][0];
                    exit[1] = exit[1] - arreySteps[i][1];
                }
            }
        }
        System.out.print(ANSI_GREEN + "Выход " + ANSI_RESET);
        for (var e: shortWay) {
            System.out.print(e + " ");
        }
    }

    public static boolean canPlace(int row, int col) {
        if (row > f.size() || col > f.size(1)) return false;
        if (f.setCell(row, col) != 0) return false;

        return true;
    }
    public static int[] positionCloseExit(int[][] array) {
        int[] closeExit = new int[1];
        int min = f.setCell(array[0][0], array[0][1]);
        for (int i = 1; i < array.length; i++) {
            if (min > f.setCell(array[i][0], array[i][1])) {
                min = f.setCell(array[i][0], array[i][1]);
                closeExit = array[i];
            }
        }
        return closeExit;
    }


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

}
