public class CurrentAccount extends BankAccount{


    public CurrentAccount(int balance) {
        super(balance);
    }

    @Override
    public int deposit(int amount) {
        return super.deposit(amount);
    }

    public int withdraw(int amount) {
        return balance -= amount;
    }

}
