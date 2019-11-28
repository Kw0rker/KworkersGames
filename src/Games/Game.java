package Games;

import GameCanva.gameCanva;
import GameController.GameController;
import Sprites.Sprite;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class Game extends JFrame implements GameController {
    private static  int POS_X = 600;
    private static  int POS_Y = 200;
    private static  int WINDOW_HEIGHT = 600;
    private static  int WINDOW_WIDTH = 800;
    private boolean resizable =true;
    protected ArrayList<Sprite> sprites=new ArrayList<>();
    protected abstract void initGame();

    protected Game(String name){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(resizable);
        setTitle(name);
        gameCanva canvas = new gameCanva(this);
        add(canvas, BorderLayout.CENTER);
        initGame();
        setVisible(true);
    }
    public static void setPosX(int posX) {
        POS_X = posX;
    }

    public static void setPosY(int posY) {
        POS_Y = posY;
    }

    public static void setWindowWidth(int windowWidth) {
        WINDOW_WIDTH = windowWidth;
    }

    public static void setWindowHeight(int windowHeight) {
        WINDOW_HEIGHT = windowHeight;
    }
    protected void update(gameCanva canva,float delta){
        for (Sprite sprite : sprites) {
            sprite.update(canva,delta);
        }

    }
    protected void render(gameCanva canva,Graphics g) {
        for (Sprite sprite : sprites) {
            sprite.render(canva, g);

        }
    }



}
