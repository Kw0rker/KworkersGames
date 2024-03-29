package Sprites;

import java.awt.*;

import GameCanva.GameCanvas;
import physics.PhysicObject;

public class Sprite
{
    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;
    protected PhysicObject object;

    protected float getLeft()
    {
        return x - halfWidth;
    }
    
    protected void setLeft(float left)
    {
        x = left + halfWidth;
    }
    
    protected float getRight()
    {
        return x + halfWidth;
    }
    
    protected void setRight(float right)
    {
        x = right - halfWidth;
    }
    
    protected float getTop()
    {
        return y - halfHeight;
    }
    
    protected void setTop(float top) 
    {
        y = top + halfHeight;
    }
    
    protected float getBottom()
    {
        return y + halfHeight;
    }
    
    protected void setBottom(float bottom) {
        y = bottom - halfHeight;
    }
    
    protected float getWidth() 
    {
        return 2f * halfWidth;
    }
    
    protected float getHeight()
    {
        return 2f * halfHeight;
    }

   public void update(GameCanvas canvas, float deltaTime) {}
   public void render(GameCanvas canvas, Graphics g) {}

    public PhysicObject getObject() 
    {
        return object;
    }
}
