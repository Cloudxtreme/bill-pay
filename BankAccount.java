public class BankAccount
{
    private String accountOwner;
    private double accountBalance;

    public BankAccount (String accountOwner,
                     double accountBalance)
    {
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }
    public void setAccountOwner(String accountOwner)
    {
        this.accountOwner = accountOwner;
    }
    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }
    public String getAccountOwner()
    {
        return accountOwner;
    }
    public double getAccountBalance()
    {
        return accountBalance;
    }
    public double depositCheck(double payCheckAmount)
    {
        accountBalance += payCheckAmount;
        return accountBalance;
    }
    public double paidBill(Bill a, double amountPaid)
    {
        a.payBill(amountPaid);
        accountBalance = accountBalance - amountPaid;
        return accountBalance;
    }
    public String toString()
    {
        return String.format("%s's account has a balance of %s.",
                getAccountOwner(), getAccountBalance());
    }
}
