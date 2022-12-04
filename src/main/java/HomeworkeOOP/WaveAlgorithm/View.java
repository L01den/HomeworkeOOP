package HomeworkeOOP.WaveAlgorithm;
public class View {

    public static void main(String[] args) {
        Field f = new Field();
        WaveAlgorithm waveAlg = new WaveAlgorithm(f);

        f.initFieldZero(10, 10);
        f.createField(20);
        int[][] arreySteps = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int[][] arrayExit = {{7, 1}, {5, 7}, {1, 6}};
        waveAlg.initExit(arrayExit);

        waveAlg.findingExit(arreySteps, 4, 4);
        waveAlg.buildingRoute(arrayExit, arreySteps);
        waveAlg.printRoute();
    }
}





