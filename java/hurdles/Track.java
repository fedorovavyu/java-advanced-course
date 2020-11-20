package hurdles;

import hurdles.Hurdles;
import participants.Participants;

public class Track implements Hurdles {
    private int length;
    public Track(int length){
        this.length = length;
    }

    @Override
    public boolean onDistance(Participants participant) {
        if (participant.run() >= length ){
            System.out.printf(" Участник пробежал %d", length);
            return true;
        } else {
            System.out.printf(" Участник не смог пробежать %d", length);
            return false;
        }
    }
}
