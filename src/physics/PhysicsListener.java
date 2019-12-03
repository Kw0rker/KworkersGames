package physics;

public interface PhysicsListener {
    void collision(PhysicObject o1,PhysicObject o2,Physics physics);
}
