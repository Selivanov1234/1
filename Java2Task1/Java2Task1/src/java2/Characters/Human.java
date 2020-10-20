package java2.Characters;

import java2.Obstacles.Track;
import java2.Obstacles.Wall;

public class Human implements Action {
    int runDistance = 1000;
    float jumpHeight = 1.5f;

    @Override
    public void run(Track track) {
        System.out.println(getClass().getSimpleName() + " runs");
        if (runDistance < track.distance()) {
            System.out.println("Couldn't do it!");
        }else {
            System.out.println("Reached finish");
        }
    }

    @Override
    public void jump(Wall wall) {
        System.out.println(getClass().getSimpleName() + " jumps");
        if (jumpHeight < wall.height()) {
            System.out.println("Couldn't make it!");
        }else {
            System.out.println("Jumped over!");
        }
    }
}
