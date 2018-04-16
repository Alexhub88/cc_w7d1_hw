public class Park extends Attraction implements IEnjoyable {

    public Park(String name, double price, int funRating) {
        super(name, price, funRating);
    }

    public String getName(){
        return super.getName();
    }

    public int getFunRating(){
        return super.getFunRating();
    }

}
