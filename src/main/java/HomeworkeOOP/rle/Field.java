package HomeworkeOOP.rle;

import java.util.Random;

public class Field {
    private int[] [] field;

    public int [] [] initFieldZero(int row, int col){
        return this.field = new int[row][col];
    }

//    public void printField(){
//        for (int i = 1; i < this.field.length - 1; i++) {
//            for (int j = 1; j < this.field[i].length - 1; j++) {
//
//                System.out.print(this.field[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }

    public void printField(){
        for (int i = 1; i < this.field.length - 1; i++) {
            for (int j = 1; j < this.field[i].length - 1; j++) {
                if(this.field[i][j] == -1){
                    System.out.print(ANSI_RED + this.field[i][j] + ANSI_RESET + "\t");
                } else if (this.field[i][j] == 1) {
                    System.out.print(ANSI_BLUE + this.field[i][j] + ANSI_RESET + "\t" );
                } else {
                    System.out.print(this.field[i][j] + "\t");
                }

            }
            System.out.println();
        }
    }

    public int setCell(int row, int col){
        return this.field[row][col];
    }

    public void editValue(int row, int col, int value){
        this.field[row][col] = value;
    }

    public int [] [] createField(int wall) {
        Random rand = new Random();
        for (int i = 0; i < wall; i++) {
            int check = 0;
            while (check == 0) {
                int x = rand.nextInt(this.field.length - 1);
                int y = rand.nextInt(this.field[0].length - 1);
                if (this.field[x] [y] != -1) {
                    this.field[x] [y] = (-1);
                    check = 1;
                }
            }
        }
        for (int i = 0; i < this.field.length; i++) {

            for (int j = 0; j < this.field[0].length; j++) {
                if(i == 0 || i == this.field.length - 1) {
                    this.field[i][j] = -1;
                }
                if(j == 0 || j == this.field[0].length - 1){
                    this.field[i][j] = - 1;
                }
            }

        }
        return this.field;
    }


    public int size(){
        return this.field.length - 1;
    }

    public int size(int i){
        return this.field[0].length - 1;
    }


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
