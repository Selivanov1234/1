package java2.Characters;

import java2.Obstacles.Track;
import java2.Obstacles.Wall;

public interface Action {
    void run (Track track);

    void jump(Wall wall);

}
