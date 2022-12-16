package HomeworkeOOP.task7;

public class Cinema {
    private int id;
    private int creatorId;
    private String name;
    private int genreId;
    static int count = 0;

    public Cinema(int cinemaId, String name, int genreId, int creatorId) {
        this.id = cinemaId;
        this.creatorId = creatorId;
        this.name = name;
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public int getGenreId() {
        return genreId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id =  count + 1;
    }
}
