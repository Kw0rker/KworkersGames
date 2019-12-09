package physics;

import Sprites.Sprite;

public  class PhysicObject extends Sprite {
    private float X_speed;
    private float Y_speed;
    private static final float G=9.8f;
    private float acceleration;

    public float getX_speed() {
        return X_speed;
    }
    public int getHalfHeight(){
        return (int)super.halfHeight;
    }
    public int getHalfWight(){
        return (int)super.halfWidth;
    }

    public float getY_speed() {
        return Y_speed;
    }

    public int getX_coordinate() {
        return (int)super.x;
    }

    public int getY_coordinate() {
        return (int)super.y;
    }

    public static float getG() {
        return G;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setX_speed(float x_speed) {
        X_speed = x_speed;
    }

    public void setY_speed(float y_speed) {
        Y_speed = y_speed;
    }

    public void setX_coordinate(int x_coordinate) {
        super.x = x_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        super.y = y_coordinate;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }
    public int getRadius(){
        return (int)(Math.max(halfHeight,halfWidth));
    }
}
