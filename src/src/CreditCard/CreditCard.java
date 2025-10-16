package CreditCard;

public class CreditCard {
    public String bankAccount;
    public double amountAcc;

    public void addMoney(double amount) {
        if (amount > 0) {
            amountAcc += amount;
            getHowAmountAcc();
        } else {
            System.out.println("You can't add negative number or 0 to your bank account balance!");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0) {
            amountAcc -= amount;
            getHowAmountAcc();
        } else {
            System.out.println("You can't withdraw negative number or 0 from your bank account balance!");
        }
    }

    public void takeInformationCard() {
        System.out.println("Your bank account number: " + bankAccount + "\nThe amount in your account :" + amountAcc);
    }

    public void getHowAmountAcc() {
        System.out.println("Your bank account balance is: " + amountAcc);
    }
}
