public class TobaccoStall extends Stall implements IRestrictable, IChargeable, IEnjoyable {

    public TobaccoStall(String name, String ownerName, int parkingSpot, double price, int funRating) {
        super(name, ownerName, parkingSpot, price, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getAge() >= 18);
    }

    public double priceFor(Visitor visitor){
        return super.getPrice();
    }

    public int getFunRating() { return super.getFunRating();
    }

    public String getName() { return super.getName();
    }
}
