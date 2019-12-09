package Sprites;


import GameCanva.GameCanvas;
import physics.PhysicObject;

import java.awt.*;

public class Ball extends PhysicObject {
    public float vx = (float)( 150 + (Math.random() * 200f));
    public float vy = (float)( 150 + (Math.random() * 200f));
    private final Color color = new Color(
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );
    public Ball() {
        halfHeight = 20 + (float) (Math.random() * 50f);
        halfWidth = halfHeight;
        System.out.println("ball created");
        object=new PhysicObject();
    }
    public Ball(int x_, int y_){
        super();
        this.x=x_;y=y_;
        halfHeight = 20 + (float) (Math.random() * 50f);
        halfWidth = halfHeight;
    }

    @Override
    public void update(GameCanvas canvas, float deltaTime) {
        x += vx * deltaTime;
        y += vy * deltaTime;
        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vx = -vx;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vx = -vx;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vy = -vy;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vy = -vy;
        }

    }

    @Override
    public void render(GameCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int) getLeft(), (int) getTop(),
                (int) getWidth(), (int) getHeight());
    }

    @Override
    public PhysicObject getObject() {
        return object;
    }

    @Override
    public int getX_coordinate() {
        return (int)x;
    }

    @Override
    public int getY_coordinate() {
        return (int)y;
    }

    @Override
    public void setX_speed(float x_speed) {
        vx=x_speed;
    }

    @Override
    public void setY_speed(float y_speed) {
        vy=y_speed;
    }

    @Override
    public float getX_speed() {
        return vx;
    }

    @Override
    public float getY_speed() {
        return vy;
    }
}
