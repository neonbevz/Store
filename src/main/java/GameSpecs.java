import java.util.LinkedList;

public class GameSpecs {
    private LinkedList<Genre> genres;
    private LinkedList<Platform> platforms;


    public GameSpecs(LinkedList<Genre> genres, LinkedList<Platform> platforms) {
        this.genres = genres;
        this.platforms = platforms;
    }

    public LinkedList<Genre> getGenres() {
        return genres;
    }

    public LinkedList<Platform> getPlatforms() {
        return platforms;
    }
}
