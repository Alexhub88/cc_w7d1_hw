public abstract class Attraction implements IEnjoyable{

    private String name;
    private double price;
    private int funRating;

    public Attraction(String name, double price, int funRating) {
        this.name = name;
        this.price = price;
        this.funRating = funRating;
    }

    public double getPrice() {
        return price;
    }

    public int getFunRating() {
        return funRating;
    }

    public String getName() {
        return name;
    }
}
