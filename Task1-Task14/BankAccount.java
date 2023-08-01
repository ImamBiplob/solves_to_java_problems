public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount(int accountNumber, double balance, String accountHolder) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) balance-=amount;
    }
}
