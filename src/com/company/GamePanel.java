package com.company;

import inputs.KeyboardInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import static utilz.Constants.PlayerConstants.*;
import static utilz.Constants.Directions.*;
import static com.company.Game.GAME_HEIGHT;
import static com.company.Game.GAME_WIDTH;




public class GamePanel extends JPanel {

    private Game game;
    public GamePanel(Game game){
        this.game = game;
        setPanelSize();
        addKeyListener(new KeyboardInputs(this));

    }




    private void setPanelSize(){
        Dimension size = new Dimension(GAME_WIDTH,GAME_HEIGHT);
        setPreferredSize(size);
    }



    public void updateGame(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        game.render(g);
    }

    public Game getGame(){
        return game;
    }

}
