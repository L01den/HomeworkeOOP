package HomeworkeOOP.task7;

public class FilmFinder {
    public FilmFinder() {
        init();
    }

    DataBase db;

    public DataBase getDb() {
        return db;
    }

    public String getAllInfoBy(int id) {
        Cinema c = db.films.get(id - 1);

        return String.format("%d %s %s %s",
                c.getId(),
                c.getName(),
                db.genres.get(c.getGenreId() - 1).getName(),
                db.studios.get(c.getGenreId() - 1).getTitleName());
    }

    DataBase init() {
        db = new DataBase();
        Cinema c1 = new Cinema(1, "Аркейн", 3, 2);
        Cinema c2 = new Cinema(2, "Майор Гром", 3, 2);
        Cinema c3 = new Cinema(3, "Ходячий замок", 1, 2);
        Cinema c4 = new Cinema(4, "Корпорация монстров", 2, 3);

        db.films.add(c1);
        db.films.add(c2);
        db.films.add(c3);
        db.films.add(c4);

        db.genres.add(new Genre(1, "Фантастика"));
        db.genres.add(new Genre(2, "Повседневность"));
        db.genres.add(new Genre(3, "Боевик"));
        FilmCreatorFactory pf = new FilmCreatorFactory();
        db.addStudios(pf.getFilmProducer("Studio Gibli"));
        db.addStudios(pf.getFilmProducer("Pixar"));
        db.addStudios(pf.getFilmProducer("Фонд Кино"));
        db.addStudios(pf.getFilmProducer("Nerflics"));

        return db;
    }
}