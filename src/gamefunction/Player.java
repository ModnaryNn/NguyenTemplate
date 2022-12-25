package gamefunction;

public class Player {
    private boolean active;
    private String name;
    private int money;
    private int position;
    private boolean inJail;
    private int jailCount;
    private boolean jailCard;
    private int railRoadCount;
    private int utilityCount;

    // CONSTRUCTOR
    public Player(String name){
    this.name = name;
    this.money = 1500;
    this.position = 0;
    this.inJail = false;
    this.jailCount = 0;
    this.jailCard = false;
    this.railRoadCount = 0;
    this.utilityCount = 0;
    }

    //METHODS

    //GETTERS AND SETTERS

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int money){
        this.money += money;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }

    public int getJailCount() {
        return jailCount;
    }

    public void setJailCount(int jailCount) {
        this.jailCount = jailCount;
    }

    public boolean isJailCard() {
        return jailCard;
    }

    public void setJailCard(boolean jailCard) {
        this.jailCard = jailCard;
    }

    public int getRailRoadCount() {
        return railRoadCount;
    }

    public void setRailRoadCount(int railCount) {
        this.railRoadCount = railCount;
    }

    public int getUtilityCount() {
        return utilityCount;
    }

    public void setUtilityCount(int utilityCount) {
        this.utilityCount = utilityCount;
    }

}
