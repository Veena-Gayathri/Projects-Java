//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    public static void main(String[] args) {
        Pizza basePizza = new Pizza(false);
        basePizza.AddExtraCheese();
        basePizza.AddExtraToppings();
        basePizza.Packaging();
        basePizza.getBill();

        LoadedPizza pizza = new LoadedPizza(true);
        pizza.getBill();
    }
}