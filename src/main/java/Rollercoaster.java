public class Rollercoaster extends Attraction implements IRestrictable, IChargeable, IEnjoyable {

    public Rollercoaster(String name, double price, int funRating) {
        super(name, price, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getHeight()>= 145 && visitor.getAge() >= 12);
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12) {
            return 0.5 * super.getPrice();
        } else {
            return super.getPrice();
        }
    }

    public String getName(){
        return super.getName();
    }

    public int getFunRating(){
        return super.getFunRating();
    }
}
