package physics;

import java.util.ArrayList;

public class Physics {
    public ArrayList<PhysicObject>objects=new ArrayList<>();

    protected int changeX(int x,float Vx,float accel,float deltaT){
        return (int)(x+Vx*deltaT+(accel*Math.pow(deltaT,2))/2);
    }

    protected int changeY(int y,float Vy,float accel,float deltaT){
        return (int)(y+Vy*deltaT+(accel*Math.pow(deltaT,2))/2);
    }
    
    protected float changeVx(float Vx,float accel,float deltaT){
        return Vx+accel*deltaT;
    }
    
    protected float changeVy(float Vy,float accel,float deltaT){
        return Vy+accel*deltaT;
    }
    
    private boolean collisionCheck(PhysicObject o1, PhysicObject o2, PhysicsListener listener){
        if ((Math.pow((o2.getX()-o1.getX()),2)+(Math.pow((o2.getY()-o1.getY()),2)))<=(Math.pow(o1.getRadius()+o2.getRadius(),2))){
                listener.collision(o1,o2,this);
                return true;
            }
        else return false;
        
    }
    public void update(float deltaT,PhysicsListener listener){
        for (PhysicObject object:objects){
            object.setX(this.changeX(object.getX(),object.getVx(),object.getAccel(),deltaT));
            object.setY(changeY(object.getY(),object.getVy(),object.getAccel(),deltaT));
            object.setVx(change_Vx(object.getVx),object.getAccel(),deltaT));
            object.setVy(change_Vy(object.getVy(),object.getAccel(),deltaT));
            for (PhysicObject object1:objects){
                if (object==object1)continue;
                collisionCheck(object,object1,listener);
            }
        }
    }
}
