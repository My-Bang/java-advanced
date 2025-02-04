package day01.test02;

public class Coffee extends Beverage{
    public static int amount;

    public Coffee(String name) {
        super(name);
        amount++;
    }

    @Override
    public void calcPrice() {
        if (getName().equals("Americano")){
            price = 1500;
        } else if (getName().equals("CafeLatte")) {
            price = 2500;
        }else if (getName().equals("Cappuccino")) {
            price = 3000;
        }
    }
}
