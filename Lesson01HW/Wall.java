import Interfaces.Hurdle;
import Interfaces.Participant;

public class Wall implements Hurdle {
    private int height;
    public Wall(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void checkWin(Participant participant) {
        if(participant.getLength() <= height){
            System.out.println(participant.getName() + " прыгнул на " + height + "!");
        }else {
            System.out.println(participant.getName() + " не может прыгнуть на " + height);
        }
    }
}
