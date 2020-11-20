package participants;

public class Human implements Participants {
    private String name;
    private int length;
    private int height;
    private boolean win = true;

    public Human(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int jump() {
        System.out.printf("Человек %s прыгнул.", name);
        return height;
    }

    public int run() {
        System.out.printf("Человек %s побежал.", name);
        return length;
    }
}
