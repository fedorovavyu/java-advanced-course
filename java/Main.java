import hurdles.Hurdles;
import hurdles.Track;
import hurdles.Wall;
import participants.Cat;
import participants.Human;
import participants.Participants;
import participants.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<Participants> participant = new CopyOnWriteArrayList<>();


        Human human1 = new Human("John", 400, 5);
        Human human2 = new Human("Alice", 400, 4);

        Cat cat1 = new Cat("Miki", 200, 9);
        Cat cat2 = new Cat("Sunny", 150, 5);

        Robot robot1 = new Robot("Jack", 350, 7);
        Robot robot2 = new Robot("Lucy", 300, 2);

        //Participants[] participants = {human1, cat1, robot1};
        Participants[] participants = {human1, human2, cat1, cat2, robot1, robot2};

        Wall wall1 = new Wall(2);
        Wall wall2 = new Wall(4);

        Track track1 = new Track(320);
        Track track2 = new Track(180);

        Hurdles[] hurdles = {wall1, track1, wall2, track2 };

        for (Participants i : participants){
            participant.add(i);
        }


        for (Hurdles hurdle : hurdles) {
            for (Participants member : participant){
                if (hurdle.onDistance(member) != true){
                    System.out.println(" и выбывает из игры");
                    participant.remove(member);
                    System.out.println();
                }else {
                    System.out.println(" и переходит к следующему испытанию.");
                }
            }

        }

    }

}
