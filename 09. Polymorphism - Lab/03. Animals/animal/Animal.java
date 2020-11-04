package animal;

public abstract class Animal {

    private String name;
    private String favoriteFood;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public abstract String explainSelf();

    protected String baseExplain() {
       return String.format("I am %s and my favourite food is %s", this.name, this.favoriteFood);
    }
}
