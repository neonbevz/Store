public class ComputerGame {
    private double price, rating;
    private String title, developer, publisher;
    private GameSpecs specs;

    public ComputerGame(String title, String developer, String publisher, double price, double rating, GameSpecs specs)
    {
        this.title = title;
        this.developer = developer;
        this.publisher = publisher;
        this.price = price;
        this.rating = rating;
        this.specs = specs;
    }

    public boolean matches(ComputerGame other) {
        int sameGenres = 0;
        for (Genre searchGenre : other.getSpecs().getGenres()) {
            if (specs.getGenres().contains(searchGenre)) {
                sameGenres += 1;
            }
        }
        int samePlatforms = 0;
        for (Platform searchPlatform : other.getSpecs().getPlatforms()) {
            if (specs.getPlatforms().contains(searchPlatform)) {
                samePlatforms += 1;
            }
        }
        return sameGenres > 1 && samePlatforms > 1;
    }


    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public GameSpecs getSpecs() {
        return specs;
    }
}
