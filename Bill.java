public class Bill {

    private String name;
    private double amountDue;

    public Bill(String name, double amountDue)
    {
        if (amountDue <= 0.00)
        {
            throw new IllegalArgumentException(
                "If amount due is 0, do not add bill. Otherwise, amount due must be" +
                        "over $0.00");
        }
        this.amountDue = amountDue;
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAmountDue(double amountDue)
    {
        if (amountDue <= 0.00)
        {
            throw new IllegalArgumentException(
                    "If amount due is 0, bill has been paid. Otherwise, amount due must be" +
                            "over $0.00");
        }
        this.amountDue = amountDue;
    }
    public String getName()
    {
        return name;
    }
    public double getAmountDue()
    {
        return amountDue;
    }
    public double payBill(double amountPaid)
    {
        amountDue = amountDue - amountPaid;
        return amountDue;
    }
    public String toString()
    {
        return String.format("%s's amount due is now: %s",
                getName(), getAmountDue());
    }
}
