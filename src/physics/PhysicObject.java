package physics;

import Sprites.Sprite;

public  class PhysicObject extends Sprite {
    private float Vx, Vy;
    private int x, y;
    private static final float G=9.8f;
    private float accel;

    public float getVx() {
        return Vx;
    }
    public int getHalfHeight(){
        return (int)super.halfHeight;
    }
    public int getHalfWidth(){
        return (int)super.halfWidth;
    }

    public float getVy() {
        return Vy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static float getG() {
        return G;
    }

    public float getAccel() {
        return accel;
    }

    public void setVx(float Vx) {
        this.Vx = Vx;
    }

    public void setVy(float Vy) {
        this.Vy = Vy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAccel(float accel) {
        this.accel = accel;
    }
    public int getRadius(){
        return (int)(Math.max(halfHeight,halfWidth));
    }
}
