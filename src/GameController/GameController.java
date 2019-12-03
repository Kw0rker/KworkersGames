package GameController;

import GameCanva.GameCanvas;


import java.awt.*;

public interface GameController {
     void onDrawFrame(GameCanvas canva, Graphics g, float delta);
    public void throwException(RuntimeException e);
}
