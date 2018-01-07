import java.util.LinkedList;

public class GameInventory {
    private LinkedList<ComputerGame> games;

    public GameInventory() {
        games = new LinkedList<>();
    }

    public void addGame(String title, String developer, String publisher, double price, double rating, GameSpecs specs)
    {
        games.add(new ComputerGame(title, developer, publisher, price, rating, specs));
    }

    public void addGame(ComputerGame game) {
        games.add(game);
    }

    public LinkedList<ComputerGame> search(GameSpecs searchSpecs) {
        int found = 0;
        ComputerGame searchGame = new ComputerGame("", "", "", 0, 0, searchSpecs);
        LinkedList<ComputerGame> matchingGames = new LinkedList<>();
        for (ComputerGame game : games) {
            if (game.matches(searchGame)) {
                matchingGames.add(game);
                found++;
            }
        }
        if (found > 0) {
            return matchingGames;
        } else {
            return null;
        }
    }

    public ComputerGame searchByTitle(String searchTitle) {
        for (ComputerGame game : games) {
            if (game.getTitle().equals(searchTitle)) {
                return game;
            }
        }
        return null;
    }
}
