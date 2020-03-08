package jc01_2020.shvaichuk.lesson06.task02;

import java.util.Arrays;

public class Bankomat {
    private int twentyAmount;
    private int fiftyAmount;
    private int hundredAmount;
    
    private int getTwentyAmount() {
        return twentyAmount;
    }
    
    private int getFiftyAmount() {
        return fiftyAmount;
    }
    
    private int getHundredAmount() {
        return hundredAmount;
    }
    
    private void addTwentyAmount(int twentyAmount) {
        this.twentyAmount += twentyAmount;
    }
    
    private void addFiftyAmount(int fiftyAmount) {
        this.fiftyAmount += fiftyAmount;
    }
    
    private void addHundredAmount(int hundredAmount) {
        this.hundredAmount += hundredAmount;
    }
    
    public Bankomat() {
        this.twentyAmount = 0;
        this.fiftyAmount = 0;
        this.hundredAmount = 0;
        System.out.println("Created an empty bankomat");
    }
    
    public Bankomat(int twentyAmount, int fiftyAmount, int hundredAmount) {
        this.twentyAmount = twentyAmount;
        this.fiftyAmount = fiftyAmount;
        this.hundredAmount = hundredAmount;
        System.out.println("Created a bankomat with " + getTotalAmount() + " amount of cash");
    }
    
    public void printCurrentAmount() {
        System.out.println("Current amount is " + getTotalAmount());
    }
    
    public int getTotalAmount() {
        return 20 * twentyAmount + 50 * fiftyAmount + 100 * hundredAmount;
    }
    
    public void addCash(int twentyAmount, int fiftyAmount, int hundredAmount) {
        addTwentyAmount(twentyAmount);
        addFiftyAmount(fiftyAmount);
        addHundredAmount(hundredAmount);
        System.out.println("Added " + (20 * twentyAmount + 50 * fiftyAmount + 100 * hundredAmount) + " to the bankomat");
    }
    
    public boolean withdrawCash(int amountToWithdraw) {
        if (!canBeWithDrawn(amountToWithdraw)) return false;

        int[] banknotesQuantity = getBanknotesQuantity(amountToWithdraw);

        if (Arrays.compare(banknotesQuantity, new int[]{0, 0, 0}) != 0) {
            withdraw(banknotesQuantity);
            System.out.println("Withdrawing successful!");
            return true;
        } else {
            System.out.println("Withdrawing rejected!");
            return false;
        }
    }

    public void withdraw(int[] banknotesQuantity) {
        if (banknotesQuantity[0] != 0) {
            addHundredAmount(-banknotesQuantity[0]);
            System.out.println("There was withdrawn " + banknotesQuantity[0] + " banknotes of 100");
        }
        if (banknotesQuantity[1] != 0) {
            addFiftyAmount(-banknotesQuantity[1]);
            System.out.println("There was withdrawn " + banknotesQuantity[1] + " banknotes of 50");
        }
        if (banknotesQuantity[2] != 0) {
            addTwentyAmount(-banknotesQuantity[2]);
            System.out.println("There was withdrawn " + banknotesQuantity[2] + " banknotes of 20");
        }
    }

    public boolean canBeWithDrawn(int amountToWithdraw) {
        System.out.println("Trying to withdraw " + amountToWithdraw + " from the bankomat...");
        if (amountToWithdraw > getTotalAmount()) {
            System.out.println("Withdrawing rejected!");
            return false;
        } else {
            return true;
        }
    }

    public int[] getBanknotesQuantity(int amountToWithdraw) {
        int[] banknotesQuantity = new int[3];
        int hundreds = getHundredAmount();
        int fifties = getFiftyAmount();
        int twenties = getTwentyAmount();

        while (amountToWithdraw >= 100 && hundreds > 0) {
            banknotesQuantity[0]++;
            hundreds--;
            amountToWithdraw -= 100;
        }

        while (amountToWithdraw >= 50 && fifties > 0) {
            banknotesQuantity[1]++;
            fifties--;
            amountToWithdraw -= 50;
        }

        while (amountToWithdraw >= 20 && twenties > 0) {
            banknotesQuantity[2]++;
            twenties--;
            amountToWithdraw -= 20;
        }

        if (amountToWithdraw == 0) {
            return banknotesQuantity;
        } else {
            return new int[]{0, 0, 0};
        }
    }
}
