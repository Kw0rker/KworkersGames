package Games.Racing;

import GameCanva.gameCanva;
import Games.Game;

import javax.swing.*;
import java.awt.*;

public class Racing extends Game {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Racing::new);
    }

    private Racing()
    {
        super("Racing Game");
    }

    @Override
    public void onDrawFrame(gameCanva canva, Graphics g, float delta) {

    }

    @Override
    public void throwException(RuntimeException e) {

    }
    @Override
    protected void initGame() {


    }

}
