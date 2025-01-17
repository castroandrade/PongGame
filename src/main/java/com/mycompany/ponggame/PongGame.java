package com.mycompany.ponggame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import Game.Screens.GameScreen;
import System.Utilities.MyKeyListener;
import System.Screens.OSWindow;

public class PongGame {
    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;
    // declare and initialize the frame
    static MyKeyListener keyListener = new MyKeyListener();
    static OSWindow myWindow = new OSWindow("Pong++;",WINDOW_WIDTH,WINDOW_HEIGHT);

    public static void main(String[] args) {
        // Adiciona um keyListener para capturar o input do usuário
        myWindow.addKeyListener(keyListener);

        // Cria o painel do jogo no frame
        GameScreen game = new GameScreen(keyListener);

        // add the game to the JFrame
        myWindow.add(game);
        
        System.out.println(myWindow.toString());

        // show the window
        myWindow.setVisible(true);
        
        // make a new Timer
        Timer timer = new Timer(25, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // game logic
                game.gameLogic();

                // repaint the screen
                game.repaint();
            }
        });

        timer.start();
        
    }
    
}