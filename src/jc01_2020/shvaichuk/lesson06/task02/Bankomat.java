package jc01_2020.shvaichuk.lesson06.task02;

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
        System.out.println("Trying to withdraw " + amountToWithdraw + " from the bankomat...");
        if (amountToWithdraw > getTotalAmount()) {
            System.out.println("Withdrawing rejected!");
            return false;
        }
        int hundredCount = 0;
        while (amountToWithdraw >= 100 && getHundredAmount() > 0) {
            addHundredAmount(-1);
            hundredCount++;
            amountToWithdraw -= 100;
        }
        
        int fiftyCount = 0;
        while (amountToWithdraw >= 50 && getFiftyAmount() > 0) {
            addFiftyAmount(-1);
            fiftyCount++;
            amountToWithdraw -= 50;
        }
        
        int twentyCount = 0;
        while (amountToWithdraw >= 20 && getTwentyAmount() > 0) {
            addTwentyAmount(-1);
            twentyCount++;
            amountToWithdraw -= 20;
        }
        if (amountToWithdraw == 0) {
            if (hundredCount > 0) System.out.println("There was withdrawn " + hundredCount + " banknotes of 100");
            if (fiftyCount > 0) System.out.println("There was withdrawn " + fiftyCount + " banknotes of 50");
            if (twentyCount > 0) System.out.println("There was withdrawn " + twentyCount + " banknotes of 20");
            System.out.println("Withdrawing successfull!");
            return true;
        } else {
            System.out.println("Withdrawing rejected!");
            return false;
        }
    }
}
