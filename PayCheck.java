public class PayCheck
{
    private String paycheckDate;
    private double paycheckAmount;
    private String checkRecipient;

    public PayCheck (String checkRecipient, String paycheckDate,
                     double paycheckAmount)
    {
        if (paycheckAmount < 0.00)
        throw new IllegalArgumentException(
            "Pay check must greater than or equal to $0.00.");
        this.checkRecipient = checkRecipient;
        this.paycheckDate = paycheckDate;
        this.paycheckAmount = paycheckAmount;
    }
    public void setCheckRecipient(String checkRecipient)
    {
        this.checkRecipient = checkRecipient;
    }
    public void setPaycheckDate(String paycheckDate)
    {
        this.paycheckDate = paycheckDate;
    }
    public void setPaycheckAmount(double paycheckAmount)
    {
        if (paycheckAmount < 0.00)
            throw new IllegalArgumentException(
                    "Pay check must grester than or equal to $0.00.");
        this.paycheckAmount = paycheckAmount;
    }
    public String getCheckRecipient()
    {
        return checkRecipient;
    }
    public String getPaycheckDate()
    {
        return paycheckDate;
    }
    public double getPaycheckAmount()
    {
        return paycheckAmount;
    }

    public String toString()
    {
        return String.format("%s's %s paycheck has %s left over after bills.",
                getCheckRecipient(), getPaycheckDate(), getPaycheckAmount());
    }
}
