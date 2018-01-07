public class PaymentCash implements PaymentStrategy{
    @Override
    public boolean pay(double price) {
        System.out.format("Succesfully paid %f in cash\n\n", price);
        return true;
    }
}
