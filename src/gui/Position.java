package gui;

public class Position {
    private int x;
    private int y;

    //CONSTRUCTOR
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //GETTERS SETTER
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}