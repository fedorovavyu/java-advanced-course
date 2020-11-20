package participants;

public class Cat implements Participants {
    private String name;
    private int length;
    private int height;
    private boolean win = true;

    public Cat(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public int jump() {
        System.out.printf("Кот %s прыгнул.", name);
        return height;
    }

    public int run() {
        System.out.printf("Кот %s побежал.", name);
        return length;
    }
}
