import java.util.LinkedList;

public interface DeliveryStrategy {
    boolean deliver(LinkedList<ComputerGame> games);
}
