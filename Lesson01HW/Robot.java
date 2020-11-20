import Interfaces.Participant;

public class Robot implements Participant {
    private String name;
    private int length;
    private int height;
    private boolean win = true;

    public Robot(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    public String getName(){
        return name;
    }
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }

    public boolean isWin() {
        return win;
    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " умеет прыгать на высоту " + height);
    }

    @Override
    public void run() {
        System.out.println("Робот " + name + " может пробежать только " + length);
    }
}
