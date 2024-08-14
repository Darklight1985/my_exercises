package exercises.cast;


public class Cat extends Animal{

    private String color;

    public Cat(int type) {
        super(type);
        this.color = "Red";
    }

    public String getColor() {
        return color;
    }
}
