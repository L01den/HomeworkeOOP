package HomeworkeOOP.task7;

import java.util.ArrayList;

public class DataBase {
    ArrayList<Cinema> films = new ArrayList<>();
    ArrayList<Studio> studios = new ArrayList<>();
    ArrayList<Genre> genres = new ArrayList<>();

    public void addStudios(Studio producer) {
        studios.add(producer);
    }
}