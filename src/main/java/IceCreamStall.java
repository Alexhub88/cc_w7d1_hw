public class IceCreamStall extends Stall implements IChargeable, IEnjoyable {

    public IceCreamStall(String name, String ownerName, int parkingSpot, double price, int funRating) {
        super(name, ownerName, parkingSpot, price, funRating);
    }

    public double priceFor(Visitor visitor){
        return super.getPrice();
    }

    public int getFunRating() { return super.getFunRating();
    }

    public String getName() { return super.getName();
    }
}
