package Minefield;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    private int rowNum;
    private int colNum;
    private String[][] map;
    String[][] board;
    private int mineNum;

    public void run() {
        System.out.println("===#    MineSweeper    #===");
        System.out.println("Input size of the map: ");
        System.out.print("row : ");
        rowNum = scan.nextInt();
        System.out.print("column : ");
        colNum = scan.nextInt();

        mineNum = (rowNum * colNum) / 4;

        map = new String[rowNum][colNum];
        board = new String[rowNum][colNum];

        initializeMapAndBoard();

        while (mineNum > 0) {
            int rowMineNum = rand.nextInt(rowNum);
            int colMineNum = rand.nextInt(colNum);

            if (map[rowMineNum][colMineNum].equals("-")) {
                map[rowMineNum][colMineNum] = "*";
                mineNum--;
            }
        }
        printBoard();
        play();
    }

    private void initializeMapAndBoard() {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                map[i][j] = "-";
                board[i][j] = "-";
            }
        }
    }

    private void printBoard() {
        for (String[] strings : board) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private void printMap() {
        for (String[] strings : map) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private void play() {
        boolean isFinished = false;
        int mineClearedArea = 0;

        while (!isFinished) {
            System.out.print("index of row: ");
            int row_idx = scan.nextInt();
            System.out.print("index of column: ");
            int col_idx = scan.nextInt();

            int mineNumCount = 0;

            if (isValid(row_idx, col_idx)) {
                if (map[row_idx][col_idx].equals("-") && board[row_idx][col_idx].equals("-")) {
                    for (int i = row_idx - 1; i < row_idx + 2; i++) {
                        for (int j = col_idx - 1; j < col_idx + 2; j++) {
                            if (i >= 0 && j >= 0 && i < rowNum && j < colNum && map[i][j].equals("*")) {
                                mineNumCount++;
                                board[row_idx][col_idx] = Integer.toString(mineNumCount);
                            } else {
                                board[row_idx][col_idx] = Integer.toString(mineNumCount);
                            }
                        }
                    }
                    mineClearedArea++;
                    printBoard();
                    if (isWin(mineClearedArea)) {
                        System.out.println("Congratulations,you've been cleared all the area of mines!");
                        printMap();
                        isFinished = true;
                        break;
                    }
                } else if (map[row_idx][col_idx].equals("*")) {
                    System.out.println("You stepped on a mine, K-BOOM!");
                    printMap();
                    isFinished = true;
                } else if (board[row_idx][col_idx].equals("-")) {
                    System.out.println("This area has already been cleared of mines!");
                }
            } else {
                System.out.println("Input valid number of indexes!");
            }

        }
    }

    private boolean isValid(int row_idx, int col_idx) {
        if (row_idx < rowNum && col_idx < colNum) {
            return true;
        }
        return false;

    }

    private boolean isWin(int mineClearedArea) {
        if (mineClearedArea == ((rowNum * colNum) - mineNum)) {
            return true;
        }
        return false;
    }
}
