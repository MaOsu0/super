package Example;

public class Apple extends Fruit{
    private static final String TYPE = "jabłkowate";
    private String variety;

    public Apple(double weight, String type, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getInfo () {
        return super.getInfo() + ", odmiana: " + variety;
    }
}
