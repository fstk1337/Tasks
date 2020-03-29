package jc01_2020.shvaichuk.lesson16;

public class Player extends Thread implements Playing {
    private String playerName;
    private GameTable gameTable;

    public Player(String name, GameTable gameTable) {
        playerName = name;
        this.gameTable = gameTable;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public void run() {
        while (true) {
            if (gameTable.hasEmptyFields()) {
                makeAMove();
                try {
                    Thread.currentThread().join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else break;
        }
    }

    @Override
    public void makeAMove() {
        System.out.println(String.format("%s is making a move", this.getPlayerName()));
    }
}
