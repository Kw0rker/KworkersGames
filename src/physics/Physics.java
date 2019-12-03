package physics;

import java.util.ArrayList;

public class Physics {
    public ArrayList<PhysicObject>objects=new ArrayList<>();

    protected int change_X_coordinate(int x,float Vx,float acceleration,float deltaT){
        return (int)(x+Vx*deltaT+(acceleration*Math.pow(deltaT,2))/2);
    }

    protected int change_Y_coordinate(int y,float Vy,float acceleration,float deltaT){
        return (int)(y+Vy*deltaT+(acceleration*Math.pow(deltaT,2))/2);
    }
    protected float change_Vx(float Vx,float acceleration,float deltaT){
        return Vx+acceleration*deltaT;
    }
    protected float change_Vy(float Vy,float acceleration,float deltaT){
        return Vy+acceleration*deltaT;
    }
    private boolean collisionCheck(PhysicObject o1,PhysicObject o2,PhysicsListener listener){
       if (

               (Math.pow((o2.getX_coordinate()-o1.getX_coordinate()),2)
                       +(Math.pow((o2.getY_coordinate()-o1.getY_coordinate()),2)))<=
                       (Math.pow(o1.getRadius()+o2.getRadius(),2))) {listener.collision(o1,o2,this);return true;}
       else return false;
    }
    public void update(float deltaT,PhysicsListener listener){
        for (PhysicObject object:objects){
            object.setX_coordinate(this.change_X_coordinate(object.getX_coordinate(),object.getX_speed(),object.getAcceleration(),deltaT));
            object.setY_coordinate(change_Y_coordinate(object.getY_coordinate(),object.getY_speed(),object.getAcceleration(),deltaT));
            object.setX_speed(change_Vx(object.getX_speed(),object.getAcceleration(),deltaT));
            object.setY_speed(change_Vy(object.getY_speed(),object.getAcceleration(),deltaT));
            for (PhysicObject object1:objects){
                if (object==object1)continue;
                collisionCheck(object,object1,listener);
            }
        }

    }
}
