package hurdles;

import hurdles.Hurdles;
import participants.Participants;

public class Wall implements Hurdles {
    private int height;
    public Wall(int height){
        this.height = height;
    }

    @Override
    public boolean onDistance(Participants participant) {
        if (participant.jump() >= height ){
            System.out.printf(" Участник перепрыгнул через стену высотой %d", height);
            return true;
        } else {
            System.out.printf(" Участник не смог перепрыгнуть через высоту %d", height);
            return false;
        }
    }
}
