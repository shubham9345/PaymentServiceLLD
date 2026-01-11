import java.util.Random;

public class RazorPayBankingSystem implements BankingSystem {
    private Random rand = new Random();

    public RazorPayBankingSystem() {
    }

    @Override
    public boolean processPayment(double amt) {
        // Simulate 20% success
        int r = rand.nextInt(100);
        return r < 90;
    }
}
