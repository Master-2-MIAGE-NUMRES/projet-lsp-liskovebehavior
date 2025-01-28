public class BankAccount {

    private int Amount;

    public int deposit(int amount) {
        return Amount+amount;
    }
    public int withdraw(int amount) {
        return Amount - amount;
    }
}
