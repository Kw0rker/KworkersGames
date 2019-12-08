package Sprites;


import GameCanva.GameCanvas;
import physics.PhysicObject;

import java.awt.*;

public class Ball extends PhysicObject
{
    public float vx = (float)( 150 + (Math.random() * 200f));
    public float vy = (float)( 150 + (Math.random() * 200f));
    private final Color color = new Color(
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );
    public Ball() 
    {
        halfHeight = 20 + (float) (Math.random() * 50f);
        halfWidth = halfHeight;
        object = new PhysicObject();
    }
    public Ball(int x, int y)
    {
        super();
        this.x=x;
        this.y=y;
        halfHeight = 20 + (float) (Math.random() * 50f);
        halfWidth = halfHeight;
    }

    @Override
    public void update(GameCanvas canvas, float deltaTime) 
    {
        x += vx * deltaTime;
        y += vy * deltaTime;
        if (getLeft() < canvas.getLeft())
        {
            setLeft(canvas.getLeft());
            vx = -vx;
        }
        if (getRight() > canvas.getRight())
        {
            setRight(canvas.getRight());
            vx = -vx;
        }
        if (getTop() < canvas.getTop()) 
        {
            setTop(canvas.getTop());
            vy = -vy;
        }
        if (getBottom() > canvas.getBottom()) 
        {
            setBottom(canvas.getBottom());
            vy = -vy;
        }
    }

    @Override
    public void render(GameCanvas canvas, Graphics g)
    {
        g.setColor(color);
        g.fillOval((int)getLeft(), (int)getTop(), (int)getWidth(), (int)getHeight());
    }

    @Override
    public PhysicObject getObject()
    {
        return object;
    }

    @Override
    public int getX() 
    {
        return (int)x;
    }

    @Override
    public int getY() 
    {
        return (int)y;
    }

    @Override
    public void setVx(float vx) 
    {
        this.vx=vx;
    }

    @Override
    public void setVy(float vy) 
    {
        this.vy=vy;
    }

    @Override
    public float getVx() 
    {
        return vx;
    }

    @Override
    public float getVy() 
    {
        return vy;
    }
}
