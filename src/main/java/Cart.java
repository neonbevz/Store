import java.util.LinkedList;

public class Cart {
    private LinkedList<ComputerGame> games;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;
    private boolean finished = false;

    public Cart() {
        games = new LinkedList<>();
    }

    public void addGame(ComputerGame game) {
        games.add(game);
    }

    public double computeTotalPrice() {
        double price = 0;
        for (ComputerGame game : games) {
            price += game.getPrice();
        }
        return price;
    }

    public boolean ship() {
        boolean paid = paymentStrategy.pay(computeTotalPrice());
        if (!paid) return false;
        boolean delivered = deliveryStrategy.deliver(games);
        if (!delivered) return false;
        finished = true;
        System.out.print("Order succesfully paid and delivered");
        return true;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public boolean getFinished() {
        return finished;
    }
}
