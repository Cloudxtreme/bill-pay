import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class BillPay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name on the Bank Account: ");
        String name = input.nextLine();
        System.out.println("Please enter your current account balance: ");
        Double balance = input.nextDouble();
        BankAccount account1 = new BankAccount(name, balance);

        System.out.println("How many bills do you have? Enter the number of bills: ");
        int value = (input.nextInt());
        Bill[] bills = new Bill[value + 1];
        int count = 1;
        while (count <= value) {
            System.out.println("Enter biller name: ");
            String billerName = input.next();
            System.out.println("Enter amount due: ");
            double amountDue = input.nextDouble();
            Bill bill = new Bill(billerName, amountDue);
            bills[count] = bill;
            System.out.printf("Use bill number %d to reference this bill.%n", count);
            count++;
        }
        System.out.println("Please enter your pay check date: ");
        String checkDate = input.next();
        System.out.println("Please enter the pay check amount.");
        double checkAmount = input.nextDouble();
        PayCheck check = new PayCheck(name, checkDate, checkAmount);
        System.out.printf("This check will be deposited in to %s's account.%n", account1.getAccountOwner());
        account1.depositCheck(check.getPaycheckAmount());
        System.out.printf("%s's account balance is now: %.2f%n", account1.getAccountOwner(),
                account1.getAccountBalance());

        System.out.println("Enter the bill reference number to pay that bill: " +
            "Enter 0 if finished. ");
        int selection = input.nextInt();
        while (selection != 0) {
            System.out.printf("The %s bill is %.2f%n%s%n", bills[selection].getName(),
                    bills[selection].getAmountDue(), "How much would you like to pay? ");
            double paymentAmount = input.nextDouble();

            account1.paidBill(bills[selection], paymentAmount);
            System.out.printf("%s's account balance is now: %.2f.%nThe %s bill " +
                            "has a balance of %.2f after payment.%n", account1.getAccountOwner(),
                    account1.getAccountBalance(), bills[selection].getName(),
                    bills[selection].getAmountDue());
            System.out.println("Enter the bill reference number to pay that bill: " +
                    "Enter 0 if finished. ");
            selection = input.nextInt();
        }
        List<Bill> list = new ArrayList<Bill>();
        for (Bill bill : bills)
            list.add(bill);

        System.out.println("Your bills are: ");

        for (int counter = 1; counter < list.size(); counter++)
            System.out.printf("%s%n", list.get(counter));
        System.out.printf("%s's account balance is: %.2f.", account1.getAccountOwner(),
                account1.getAccountBalance());
        }
    }




