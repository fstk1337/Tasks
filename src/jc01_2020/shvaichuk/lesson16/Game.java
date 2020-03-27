package jc01_2020.shvaichuk.lesson16;

import java.util.Random;

public class Game extends Thread {
	private GameTable table;
	private Player player1;
	private Player player2;
	private Player firstToMove;
	private boolean gameInProgress;
	private GameResult gameResult;

	public Game(Player player1, Player player2) {
		GameTable table = new GameTable();
		this.player1 = player1;
		this.player2 = player2;
		System.out.println(String.format("%s and %s joined the Game.", player1.getName(), player2.getName()));
	}

	public Player chooseFirstToMove() {
		boolean isFirst = new Random().nextBoolean();
		if (isFirst) return player1;
		return player2;
	}

	@Override
	public void run() {
		gameInProgress = true;
		System.out.println("The Game started.");
		firstToMove = chooseFirstToMove();
		System.out.println(String.format("%s is first to move.", firstToMove.getName()));
	}
}
