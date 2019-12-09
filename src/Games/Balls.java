package Games;

import GameCanva.GameCanvas;
import GameController.GameController;
import Sprites.Ball;
import Sprites.Sprite;
import Sprites.land;
import physics.PhysicObject;
import physics.Physics;
import physics.PhysicsListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Balls extends JFrame implements GameController, PhysicsListener {
    private static final int POS_X = 600;
    private static final int POS_Y = 600;
    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 720;
    Physics physics=new Physics();
    ArrayList<Sprite> sprites=new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Balls::new);
    }

    public Balls() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Circles");
        GameCanvas canvas = new GameCanvas(this);
        add(canvas, BorderLayout.CENTER);
        initApplication();
        setVisible(true);
    }

    private void initApplication() {
        int x=0,y=0;
        Random random=new Random();
        for (int i = 0; i < 12; i++) {
            Ball ball=new Ball(random.nextInt(WINDOW_WIDTH),random.nextInt(WINDOW_HEIGHT));
            sprites.add(ball);
            int x2=random.nextInt(x+200);
            int y2=random.nextInt(y+200);
            land l=new land(x,x2,y,y2);
            //sprites.add(l);
            //physics.objects.add(l);
            physics.objects.add(ball);
            x=x2;y=y2;
        }
    }

    @Override
    public void onDrawFrame(GameCanvas canva, Graphics g, float delta) {
        physics.update(delta,this);
        update(canva,delta);
        render(g,canva);
    }

    @Override
    public void throwException(RuntimeException e) {}
    private void update(GameCanvas canvas,float deltaT){
        for (Sprite s:sprites)s.update(canvas,deltaT);
    }
    private void render(Graphics g,GameCanvas canvas){
        for (Sprite s:sprites)s.render(canvas,g);
    }

    @Override
    public void collision(PhysicObject o1, PhysicObject o2, Physics physics) {
        if (o1 instanceof land&&o2 instanceof land) return;
        //if (o1 instanceof Ball&&o2 i) return;
        o1.setY_speed(o1.getY_speed()*-1);
        o2.setX_speed(o2.getX_speed()*-1);
        //o2.setX_speed(o2.getX_speed()*-1);
        //o1.setX_speed(o1.getX_speed()*-1);
        System.out.println("coolision detected");
    }
}
