package day01.test02;

public class Tea extends Beverage {
    public static int amount;

    public Tea(String name) {
        super(name);
        amount++;
    }

    @Override
    public void calcPrice() {
        if (getName().equals("lemonTea")) {
            price = 1500;
        } else if (getName().equals("ginsengTea")) {
            price = 2000;
        } else if (getName().equals("redginsengTea")) {
            price = 2500;

        }
    }
}
