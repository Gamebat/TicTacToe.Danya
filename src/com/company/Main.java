package com.company;

import com.company.controller.Controller;
import com.company.model.Game;
import com.company.view.View;

public class Main {
    public static void main(String[] args) {
        Game game = Game.GetInstance();
        View view = View.getInstance();
        Controller controller = Controller.getInstance();
        do {
            view.YourStep();
            controller.turnHuman();
            if (game.checkWin(game.SIGN_O) || game.isTableFull() || game.checkWin(game.SIGN_X)) {
                view.printTable();
                break;
            }
            controller.TurnAI();
            view.printTable();
        }
        while (!game.checkWin(game.SIGN_O) && !game.isTableFull() && !game.checkWin(game.SIGN_X));
        if (game.checkWin(game.SIGN_X)) view.YouWin();
        if (game.checkWin(game.SIGN_O)) view.YouLose();
        if (game.isTableFull()) view.Tie();
    }
}
