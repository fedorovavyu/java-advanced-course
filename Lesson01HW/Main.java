import Interfaces.Hurdle;
import Interfaces.Participant;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("John", 400, 2);
        Human human2 = new Human("Alice", 400, 1);

        Cat cat1 = new Cat("Miki", 200, 2);
        Cat cat2 = new Cat("Sunny", 150, 1);

        Robot robot1 = new Robot("Jack", 350, 5);
        Robot robot2 = new Robot("Lucy", 300, 4);

        Participant[] participants = {human1, human2, cat1, cat2, robot1, robot2};

        Wall wall1 = new Wall(2);
        Wall wall2 = new Wall(4);

        Track track1 = new Track(320);
        Track track2 = new Track(180);

        Hurdle[] hurdles = {wall1, wall2, track1, track2 };


        for (int i = 0; i < hurdles.length; i++) {
            for (Participant participant : participants){
                if (true){
                    hurdles[i].checkWin(participant);
                }
            }
        }

    }
}
