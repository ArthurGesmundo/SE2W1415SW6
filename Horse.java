public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Hay";
        this.color = "Brown";
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    @Override
    public Animal clone() {
        return new Horse();
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public String toString() {
        return "Horse{color='" + color + "', sound='" + sound + "', food='" + food + "', legs=" + legs + "}";
    }
}