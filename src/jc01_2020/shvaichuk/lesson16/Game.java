package jc01_2020.shvaichuk.lesson16;

import java.util.Random;

public class Game extends Thread {
	private GameTable table;
	private Player player1;
	private Player player2;
	private Player firstToMove;
	private boolean gameInProgress;
	private GameResult gameResult;

	public Game() {
		GameTable table = new GameTable();
		player1 = new Player("Calvin", table);
		player2 = new Player("Andrew", table);
		System.out.println(String.format("%s and %s joined the Game.", player1.getPlayerName(), player2.getPlayerName()));
	}

	public Player chooseFirstToMove() {
		boolean isFirst = new Random().nextBoolean();
		if (isFirst) return player1;
		return player2;
	}

	@Override
	public void run() {
		firstToMove = chooseFirstToMove();
		System.out.println(String.format("%s is first to move.", firstToMove.getPlayerName()));
		gameInProgress = true;
		System.out.println("The Game started.");
		player1.start();
		player2.start();
		while (gameInProgress) {
			try {
				Thread.currentThread().join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
