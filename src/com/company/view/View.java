package com.company.view;

import com.company.model.Game;

public class View {

    private static View instance = new View();
    private Game game = Game.GetInstance();

    private View() {
    }

    public static View getInstance(){
        return instance;
    }

    public void YourStep(){
        System.out.println("Enter X and Y (1..3):");
    }

    public void YouWin(){
        System.out.println("YOU WIN!");
        System.out.println("GAME OVER.");
    }

    public void YouLose(){
        System.out.println("YOU LOSE!");
        System.out.println("GAME OVER.");
    }

    public void Tie(){
        System.out.println("TIE");
        System.out.println("GAME OVER.");
    }

    //отображените текущего состояния таблицы
    public void printTable() {
        char[][] table = game.getTable();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }

}
