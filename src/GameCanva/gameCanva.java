package GameCanva;

import GameController.GameController;

import javax.swing.*;
import java.awt.*;

public class gameCanva extends JPanel {
   private GameController controller;
    private long lastFrameTime;
    public gameCanva(GameController controller){
        this.controller=controller;
        lastFrameTime = System.nanoTime();

    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        long time=System.nanoTime();
        float deltaTime = (time - lastFrameTime) * 0.000000001f;
        controller.onDrawFrame(this,g,deltaTime);
        try
        {
            Thread.sleep(17);
        } catch (InterruptedException e) {
        }
        repaint();

    }
    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }
}
