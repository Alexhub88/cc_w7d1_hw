public abstract class Stall implements IChargeable,  IEnjoyable{

    private String name;
    private String ownerName;
    private int parkingSpot;
    private double price;
    private int funRating;

    public Stall(String name, String ownerName, int parkingSpot, double price, int funRating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
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
