package com.workshop;

public class TicTacToeGame {

	/**
	 * declare 1d array of char type
	 */
	static char[] gameBoard = new char[10];

	/**
	 * method for creating empty GameBoard
	 */
	public void createGameBoard() {
		for (int a = 1; a < gameBoard.length; a++) {
			gameBoard[a] = ' ';
		}
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		TicTacToeGame ticTacToeGame = new TicTacToeGame();

		System.out.println("#####################################\n      Welcome 2 TicTacToe Game\n#####################################\n");

		ticTacToeGame.createGameBoard();
	}
}


