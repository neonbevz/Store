import java.util.LinkedList;

public class CartDecoratorBonus extends CartDecorator{
    public CartDecoratorBonus(Cart cartToDecorate) {
        super(cartToDecorate);
    }

    @Override
    public boolean ship() {
        LinkedList<Genre> bfGenres = new LinkedList<>();
        bfGenres.add(Genre.ACTION); bfGenres.add(Genre.FPS); bfGenres.add(Genre.MULTIPLAYER);
        bfGenres.add(Genre.MULTIPLAYER); bfGenres.add(Genre.PVP); bfGenres.add(Genre.SINGLEPLAYER);
        LinkedList<Platform> bfPlatforms = new LinkedList<>();
        bfPlatforms.add(Platform.PS4); bfPlatforms.add(Platform.XBOXONE); bfPlatforms.add(Platform.WINDOWS);
        GameSpecs bfSpecs = new GameSpecs(bfGenres, bfPlatforms);
        ComputerGame bonusGame = new ComputerGame("Battlefield 1", "DICE", "EA", 0,
                8.0, bfSpecs);

        super.addGame(bonusGame);
        return super.ship();
    }
}
