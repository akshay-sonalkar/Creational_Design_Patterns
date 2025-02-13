public class Orc implements GameCharacter {
    private String name;
    private String weapon;
    private String color;

    public Orc(String name, String weapon, String color) {
        this.name = name;
        this.weapon = weapon;
        this.color = color;
    }

    @Override
    public GameCharacter clone() {
        return new Orc(name, weapon, color);
    }

    @Override
    public void display() {
        System.out.println("Orc: " + name + ", " + weapon + ", " + color);
    }

    public void setColor(String red) {
        this.color = red;
    }
}
