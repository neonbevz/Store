import java.util.LinkedList;

public class DeliveryNovaPoshta implements DeliveryStrategy {
    @Override
    public boolean deliver(LinkedList<ComputerGame> games) {
        StringBuilder str = new StringBuilder("Succesfully delivered these games:\n");
        for (ComputerGame game : games) {
            str.append("- ");
            str.append(game.getTitle());
            str.append("\n");
        }
        str.append("with Nova Poshta\n\n");
        System.out.print(str);
        return true;
    }
}
