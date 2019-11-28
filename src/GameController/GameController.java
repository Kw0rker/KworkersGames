package GameController;

import GameCanva.gameCanva;

import java.awt.*;

public interface GameController {
    public void onDrawFrame(gameCanva canva, Graphics g,float delta);
    public void throwException(RuntimeException e);
}
