package animal;

public class Cat extends Animal{

    private final static String MEEOW = "MEEOW";

    public Cat(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        String explain = String.format("%s %n %s", super.baseExplain(), MEEOW);
        return explain;
    }
}
