import Interfaces.Hurdle;
import Interfaces.Participant;

public class Track implements Hurdle {
    private int length;
    public Track(int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void checkWin(Participant participant){
        if(participant.getLength() <= length){
            System.out.println(participant.getName() + " пробежал " + length + "!");
        }else {
            System.out.println(participant.getName() + " не может пробежать дистанцию " + length);
        }
    }
}
