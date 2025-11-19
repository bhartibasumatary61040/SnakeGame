package org.example;

import javax.swing.*;

public class Snake {
    public static void main(String[] args) throws Exception {

        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame fram  = new JFrame("Snake");
        fram.setVisible(true);
        fram.setSize(boardWidth,boardHeight);
        fram.setLocationRelativeTo(null);
        fram.setResizable(false);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardWidth);
        fram.add(snakeGame);
        //fram.pack();
        snakeGame.requestFocus();

    }


}
