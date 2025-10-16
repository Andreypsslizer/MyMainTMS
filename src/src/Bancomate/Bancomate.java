package Bancomate;

public class Bancomate {
    public int quantityTwenty;
    public int quantityFifty;
    public int quantityHundred;

    public Bancomate(int quantityTwenty, int quantityFifty, int quantityHundred) {
        this.quantityTwenty = quantityTwenty;
        this.quantityFifty = quantityFifty;
        this.quantityHundred = quantityHundred;
    }

    public void addMoney(int amount) {
        int noteHundred = amount / 100;
        int noteFifty = (amount % 100) / 50;
        int noteTwenty = ((amount % 100) % 50) / 20;
        quantityHundred += noteHundred;
        quantityFifty += noteFifty;
        quantityTwenty += noteTwenty;
        System.out.println("Added notes: \n\tHundreds: " + noteHundred + "\n\tFifty: " + noteFifty +
                "\n\tTwentys: " + noteTwenty);
    }

    public boolean withdrawMoney(int amount) {
        int noteHundred = 0;
        int noteFifty = 0;
        int noteTwenty = 0;
        boolean isWithdraw = false;
        while(quantityTwenty > 0 && amount > 0 && (amount / 20) > 0) {
            if((amount % 100) == 0) break;
            amount -= 20;
            quantityTwenty--;
            noteTwenty++;
        }
        while(quantityHundred > 0 && amount > 0 && (amount / 100) > 0) {
            amount -= 100;
            quantityHundred--;
            noteHundred++;
        }
        while(quantityFifty > 0 && amount > 0 && (amount / 50) > 0) {
            amount -= 50;
            quantityFifty--;
            noteFifty++;
        }

        if (amount == 0) {
            System.out.println("Withdraw notes: \n\tHundreds: " + noteHundred + "\n\tFifty: " + noteFifty +
                    "\n\tTwentys: " + noteTwenty);
            isWithdraw = true;
        } else {
            System.out.println("The ATM does not have enough required notes!");
        }
        return isWithdraw;
    }
}
