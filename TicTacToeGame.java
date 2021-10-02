package com.workshop;
import java.util.*;
public class TicTacToeGame {

	/**
	 * declare 1d array of char type
	 */
	static char[] gameBoard = new char[10];
	public static char Computerletter;
    public static char Playerletter;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


	/**
	 * method for creating empty GameBoard
	 */
	public void createGameBoard() {
		for (int a = 1; a < gameBoard.length; a++) {
			gameBoard[a] = ' ';
		}
	}
	/**
     * method for choose Letter X or O
     */
    public void selectLetter() {
        int flag = 0;
        while (flag == 0) {
            System.out.print("\nChoose your Letter\nPress 1 -> 'X'\nPress 2 -> 'O'\nEnter your Choice -> ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Playerletter = 'X';
                Computerletter = 'O';
                System.out.println("\nPlayer letter -> " + Playerletter);
                System.out.println("Computer letter -> " + Computerletter);
                flag = 1;
            } else if (choice == 2) {
                Playerletter = 'O';
                Computerletter = 'X';
                System.out.println("\nPlayer letter -> " + Playerletter);
                System.out.println("Computer letter -> " + Computerletter);
                flag = 2;
            } else {
                System.out.println("\n>>>>>>> plz enter 1 or 2 <<<<<<<<<");
            }
        }
    }
    /**
     * method for display Board
     */
    public void showBoard() {
        System.out.println("  " + gameBoard[1] + " | "
                + gameBoard[2] + " | " + gameBoard[3]
                + "  ");
        System.out.println("----|---|----");
        System.out.println("  " + gameBoard[4] + " | "
                + gameBoard[5] + " | " + gameBoard[6]
                + "  ");
        System.out.println("----|---|----");
        System.out.println("  " + gameBoard[7] + " | "
                + gameBoard[8] + " | " + gameBoard[9]
                + "  ");

    }
    /**
     * method for user move on desired location
     */
    public void playerPlaying() {
        System.out.println("\n>>>>>>>> Player Turn <<<<<<<<");
        showBoard();
        System.out.print("Enter your position [1-9] -> ");
        int playerPosition = scanner.nextInt();
        gameBoard[playerPosition] = Playerletter;
        showBoard();
    }

    /**
     * method for user move on desired location
     */
    public void computerPlaying() {
        System.out.println("\n>>>>>>>> Computer Turn <<<<<<<<\n");
        int computerPosition = random.nextInt(9) + 1;
        gameBoard[computerPosition] = Computerletter;
        showBoard();
    }
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		TicTacToeGame ticTacToeGame = new TicTacToeGame();

		System.out.println("#####################################\n      Welcome 2 TicTacToe Game\n#####################################\n");

		ticTacToeGame.createGameBoard();
		ticTacToeGame.selectLetter();
		ticTacToeGame.showBoard();
		ticTacToeGame.playerPlaying();
        ticTacToeGame.computerPlaying();
	}
}


