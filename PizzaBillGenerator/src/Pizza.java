public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int packagingPrice = 20;
    private int basePizzaPrice;

    private boolean extraCheese = false;
    private boolean extraTopping = false;
    private boolean packaging= false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        extraCheese = true;
//        System.out.println("Extra Cheese Added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        extraTopping = true;
//        System.out.println("Extra Toppings Added");
        this.price += extraToppingPrice;
    }

    public void packaging(){
        packaging = true;
//        System.out.println("Take Away Opted");
        this.price += packagingPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza : "+ basePizzaPrice);
        if (extraCheese){
            bill += "Extra Cheese Added: "+ extraCheesePrice + "\n";
        }
        if(extraTopping){
            bill += "Extra Topping Added: "+ extraToppingPrice + "\n";
        }
        if(packaging){
            bill += "Packaging Cost: "+ packagingPrice + "\n";
        }
        bill += "Bill: "+ this.price + "\n";
        System.out.println(bill);
    }
}
