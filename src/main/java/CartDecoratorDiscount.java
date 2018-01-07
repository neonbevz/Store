public class CartDecoratorDiscount extends CartDecorator {
    public CartDecoratorDiscount(Cart cartToDecorate) {
        super(cartToDecorate);
    }

    @Override
    public double computeTotalPrice() {
        return super.computeTotalPrice() * 0.75;
    }
}
