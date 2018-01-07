public class PaymentPrivat24 implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.format("Succesfully paid %f with Privat24\n\n", price);
        return true;
    }
}
