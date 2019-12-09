package Sprites;


import GameCanva.GameCanvas;
import physics.PhysicObject;

import java.awt.*;

public class land extends PhysicObject {
    int x1,x2,y1,y2;

    public land(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void update(GameCanvas canvas, float deltaTime) {}

    @Override
    public void render(GameCanvas canvas, Graphics g) {
        g.drawLine(x1,y1,x2,y2);
    }
}
