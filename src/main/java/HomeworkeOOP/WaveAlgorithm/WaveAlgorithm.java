package HomeworkeOOP.WaveAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WaveAlgorithm {
    Field field;
    List<List<Integer>> shortWay = new ArrayList<>();
    public WaveAlgorithm(Field f) {
        this.field = f;
    }

    public void initExit(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            field.editValue(array[i][0], array[i][1], 0);
        }
    }

    public void findingExit(int[][] arreySteps, int startX, int startY) {
        Queue queueSteps = new LinkedList();
        queueSteps.add(new int[]{startX, startY, 1});

        while (!queueSteps.isEmpty()) {
            int[] temp = (int[]) queueSteps.poll();
            field.editValue(temp[0], temp[1], temp[2]);
            temp[2]++;
            for (int i = 0; i < arreySteps.length; i++) {
                if (canPlace(temp[0] + arreySteps[i][0], temp[1] + arreySteps[i][1])) {
                    queueSteps.add(new int[]{temp[0] + arreySteps[i][0], temp[1] + arreySteps[i][1], temp[2]});
                }
            }
        }
        field.printField();
    }

    public void buildingRoute(int [][] arrayExit, int [][] arreySteps) {
        int[] exit = positionCloseExit(arrayExit);
        int lastMove = (field.setCell(exit[0], exit[1])) - 1;

        while (lastMove > 0) {
            for (int i = 0; i < arreySteps.length; i++) {
                int move = field.setCell(exit[0] - arreySteps[i][0], exit[1] - arreySteps[i][1]);
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
    }

    public void printRoute() {
        System.out.print(ANSI_GREEN + "Выход " + ANSI_RESET);
        for (var e : shortWay) {
            System.out.print(e + " ");
        }
    }

    private boolean canPlace(int row, int col) {
        if (row > field.size() || col > field.size(1)) return false;
        if (field.setCell(row, col) != 0) return false;

        return true;
    }

    private int[] positionCloseExit(int[][] array) {
        int[] closeExit = new int[1];
        int min = field.setCell(array[0][0], array[0][1]);
        for (int i = 1; i < array.length; i++) {
            if (min > field.setCell(array[i][0], array[i][1])) {
                min = field.setCell(array[i][0], array[i][1]);
                closeExit = array[i];
            }
        }
        return closeExit;
    }

    public final String ANSI_GREEN = "\u001B[32m";
    public final String ANSI_RESET = "\u001B[0m";
}





