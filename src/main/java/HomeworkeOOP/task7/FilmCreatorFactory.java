package HomeworkeOOP.task7;

public class FilmCreatorFactory {
    int count = 1;

    public Studio getFilmProducer(String name) {
        Studio fp = new Studio();
        fp.setId(count++);
        fp.setTitleName(name);
        return fp;
    }
}
