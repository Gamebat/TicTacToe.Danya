package com.company.controller;
import com.company.model.Game;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Game game = Game.GetInstance();

    private static Controller controller = new Controller();

    public Controller() {
    }

    public static Controller getInstance(){
        return controller;
    }

    public void turnHuman() {
        int x, y;
        do {
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!game.isCellValid(x, y));
        game.turnHuman(x,y);
    }

    public void TurnAI(){
        game.turnAI();
    }
}
