public class Dodgems extends Attraction implements IChargeable, IEnjoyable {

    public Dodgems(String name, double price, int funRating) {
        super(name, price, funRating);
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