public class bankAccount {
    private Integer balance;

    public bankAccount(Integer initialBalance) {
        balance = initialBalance;
    }
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }

}
