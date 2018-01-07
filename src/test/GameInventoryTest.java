import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class GameInventoryTest {
    private GameInventory inventory;

    @Test
    public void addGame() {
        generateTestInventory();
        Assert.assertTrue(inventory.searchByTitle("Battlefield 1").matches(bf1Game()));
        Assert.assertTrue(inventory.searchByTitle("Battlefield 1").getPrice() == bf1Game().getPrice());
    }

    @Test
    public void addGame1() {
    }

    @Test
    public void search() {
    }

    @Test
    public void searchByTitle() {
    }

    private void generateTestInventory() {
        LinkedList<ComputerGame> testGames = generateTestGames();
        inventory = new GameInventory();
        for (ComputerGame game : testGames) {
            inventory.addGame(game);
        }

    }

    private static ComputerGame bf1Game() {
        // Battlefield 1
        LinkedList<Genre> bfGenres = new LinkedList<>();
        bfGenres.add(Genre.ACTION); bfGenres.add(Genre.FPS); bfGenres.add(Genre.MULTIPLAYER);
        bfGenres.add(Genre.MULTIPLAYER); bfGenres.add(Genre.PVP); bfGenres.add(Genre.SINGLEPLAYER);
        LinkedList<Platform> bfPlatforms = new LinkedList<>();
        bfPlatforms.add(Platform.PS4); bfPlatforms.add(Platform.XBOXONE); bfPlatforms.add(Platform.WINDOWS);

        GameSpecs bfSpecs = new GameSpecs(bfGenres, bfPlatforms);
        return new ComputerGame("Battlefield 1", "DICE", "EA", 59.99,
                8.0, bfSpecs);
    }

    private static ComputerGame c3Game() {
        // Cossacks 3
        LinkedList<Genre> c3Genres = new LinkedList<>();
        c3Genres.add(Genre.SINGLEPLAYER); c3Genres.add(Genre.PVP); c3Genres.add(Genre.MULTIPLAYER);
        c3Genres.add(Genre.PVE); c3Genres.add(Genre.RTS);
        LinkedList<Platform> c3Platforms = new LinkedList<>();
        c3Platforms.add(Platform.WINDOWS); c3Platforms.add(Platform.MAC); c3Platforms.add(Platform.LINUX);

        GameSpecs c3Specs = new GameSpecs(c3Genres, c3Platforms);
        return new ComputerGame("Cossacks 3", "GSC Game World", "GSC Game World",
                12.99,7.5, c3Specs);
    }

    private static ComputerGame forzaGame() {
        // Forza Horizon 3
        LinkedList<Genre> forzaGenres = new LinkedList<>();
        forzaGenres.add(Genre.PVE); forzaGenres.add(Genre.MULTIPLAYER); forzaGenres.add(Genre.PVP);
        forzaGenres.add(Genre.SINGLEPLAYER); forzaGenres.add(Genre.OPENWORLD); forzaGenres.add(Genre.RACING);
        LinkedList<Platform> forzaPlatforms = new LinkedList<>();
        forzaPlatforms.add(Platform.WINDOWS); forzaPlatforms.add(Platform.XBOXONE);

        GameSpecs forzaSpecs = new GameSpecs(forzaGenres, forzaPlatforms);
        return new ComputerGame("Forza Horizon 3", "", "", 69.99,
                8.5, forzaSpecs);
    }

    private static LinkedList<ComputerGame> generateTestGames() {
        LinkedList<ComputerGame> games = new LinkedList<>();
        games.add(bf1Game());
        games.add(c3Game());
        games.add(forzaGame());
        return games;
    }


}