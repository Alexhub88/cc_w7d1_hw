public class CandyFlossStall extends Stall implements IChargeable, IEnjoyable {


    public CandyFlossStall(String name, String ownerName, int parkingSpot, double price, int funRating) {
        super(name, ownerName, parkingSpot, price, funRating);
    }

    public double priceFor(Visitor visitor){
        return super.getPrice();
    }

    public int getFunRating() { return super.getFunRating(); }

    public String getName() { return super.getName(); }
}
