import Interfaces.Participant;

public class Human implements Participant {
    private String name;
    private int length;
    private int height;
    private boolean win = true;

    public Human(String name, int length, int height) {
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
        System.out.println("Человек " + name + " умеет прыгать на высоту " + height);
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " может пробежать только " + length);
    }
}
