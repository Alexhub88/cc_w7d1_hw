public class Playground extends Attraction implements IRestrictable, IEnjoyable {

    public Playground(String name, double price, int funRating) {
        super(name, price, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getAge() <= 15);
    }

    public String getName(){
        return super.getName();
    }

    public int getFunRating(){
        return super.getFunRating();
    }
}
