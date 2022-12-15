package gamefunction;

public abstract class Square {
    private String name;
    private boolean available;
    private int x;
    private int y;

    //CONSTRUCTOR
    public Square(){
    }

    public Square(String name, boolean available, int x, int y) {
        this.name = name;
        this.available = available;
        this.x = x;
        this.y = y;
    }

    //METHODS
    public void action(GameHandler gameHandler){

    }

    //SETTERS AND GETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
