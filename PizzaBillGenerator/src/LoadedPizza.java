public class LoadedPizza extends Pizza {
    public LoadedPizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}
}
