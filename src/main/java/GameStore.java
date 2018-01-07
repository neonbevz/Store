import java.util.LinkedList;

public class GameStore {
    private GameInventory inventory;

    public GameStore() {
        this.inventory = new GameInventory();
    }

    public void addGame(String title, String developer, String publisher, double price, double rating, GameSpecs specs)
    {
        inventory.addGame(title, developer, publisher, price, rating, specs);
    }

    public void addGame(ComputerGame game) {
        inventory.addGame(game);
    }

    public LinkedList<ComputerGame> searchGame(GameSpecs searchSpecs) {
        return inventory.search(searchSpecs);
    }

    public ComputerGame searchGameByTitle(String searchTitle) {
        return inventory.searchByTitle(searchTitle);
    }

    public static String searchResultsToString(LinkedList<ComputerGame> games) {
        if (games == null) {
            return "Sorry, no games matching your request found.\n";
        }
        StringBuilder out = new StringBuilder("Here are the games that may match your search:\n----------\n");
        for (ComputerGame game : games) {
            String formatString = "     %s\nRating: %f\n\nPlatforms: %s\nGenres: %s\nDeveloper, publisher: %s, %s\n\nPrice: %f$\n";
            StringBuilder platformsString = new StringBuilder();
            for (int i=0; i<game.getSpecs().getPlatforms().size(); i++) {
                if (i>0) {
                    platformsString.append(", ");
                }
                platformsString.append(game.getSpecs().getPlatforms().get(i));
            }
            StringBuilder genresString = new StringBuilder();
            for (int i=0; i<game.getSpecs().getGenres().size(); i++) {
                if (i>0) {
                    genresString.append(", ");
                }
                genresString.append(game.getSpecs().getGenres().get(i));
            }
            String outString = String.format(formatString, game.getTitle(), game.getRating(), platformsString,
                                             genresString, game.getDeveloper(), game.getPublisher(), game.getPrice());
            out.append(outString);
            out.append("----------\n");
        }
        return out.toString();
    }
}
