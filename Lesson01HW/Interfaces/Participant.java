package Interfaces;

public interface Participant extends Jump, Run {
    String getName();
    int getLength();
    int getHeight();
    boolean isWin();
}
