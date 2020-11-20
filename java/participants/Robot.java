package participants;

public class Robot implements Participants {
    private String name;
    private int length;
    private int height;
    private boolean win = true;

    public Robot(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public int jump() {
        System.out.printf("Робот %s прыгнул.", name);
        return height;
    }

    public int run() {
        System.out.printf("Робот %s пробежал.", name);
        return length;
    }
}
