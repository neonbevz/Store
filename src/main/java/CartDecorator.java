public class CartDecorator extends Cart{
    private Cart cart;

    public CartDecorator(Cart cartToDecorate) {
        cart = cartToDecorate;
    }

    @Override
    public void addGame(ComputerGame game) {
        cart.addGame(game);
    }

    @Override
    public double computeTotalPrice() {
        return cart.computeTotalPrice();
    }

    @Override
    public boolean ship() {
        return cart.ship();
    }

    @Override
    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        cart.setDeliveryStrategy(deliveryStrategy);
    }

    @Override
    public DeliveryStrategy getDeliveryStrategy() {
        return cart.getDeliveryStrategy();
    }

    @Override
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        cart.setPaymentStrategy(paymentStrategy);
    }

    @Override
    public PaymentStrategy getPaymentStrategy() {
        return cart.getPaymentStrategy();
    }

    @Override
    public boolean getFinished() {
        return cart.getFinished();
    }
}
