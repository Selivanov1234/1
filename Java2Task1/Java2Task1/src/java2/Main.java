package java2;

import java2.Characters.Action;
import java2.Characters.Cat;
import java2.Characters.Human;
import java2.Characters.Robot;
import java2.Obstacles.Obstacle;
import java2.Obstacles.Track;
import java2.Obstacles.Wall;




public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Robot robot = new Robot();
        Human human = new Human();

        Track track = new Track();
        Wall wall = new Wall();

        Action[] arrChars = {cat, robot, human};
        Obstacle[] arrObst = {wall, track};

        for (int i = 0; i < arrChars.length; i++) {
            arrChars[i].jump(wall);
            arrChars[i].run(track);
           // for (int j = 0; j < arrObst.length; j++) {
           //     // cat.jump(wall);
           //     // cat.run(track);
           // }
        }
    }
    // for (Action action:arrChars) {
    //     action.jump(wall);
    //     action.run(track);
    // }

}

