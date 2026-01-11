import java.util.Random;

public class PaytmBankingSystem implements BankingSystem{
    private Random rand = new Random();

    public PaytmBankingSystem() {}
    @Override
    public boolean processPayment(double amt) {
        // Simulate 20% success
        int r = rand.nextInt(100);
        return r < 80;
    }
}
