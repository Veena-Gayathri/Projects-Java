public class LoadedPizza extends Pizza {
    public LoadedPizza(Boolean veg){
        super(veg);
        super.AddExtraCheese();
        super.AddExtraToppings();
    }

    @Override
    public void AddExtraCheese() {}

    @Override
    public void AddExtraToppings() {}
}
