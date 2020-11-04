package animal;

public class Dog extends Animal{

    private final static String DJAAF= "DJAAF";

    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        String explain = String.format("%s %n %s", super.baseExplain(), DJAAF);
        return explain;
    }
}
