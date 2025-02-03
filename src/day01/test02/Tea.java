package day01.test02;

public class Tea extends Beverage{
    public static int amount;

    public Tea(String name) {
        super(name);
    }

    @Override
    public void calcPrice() {
        if (getName().equals("lemonTea")){
            price = 1500;
            amount++;

        } else if (getName().equals("ginsengTea")) {
            price = 2000;
            amount++;

        }else if (getName().equals("redginsengTea")) {
            price = 2500;
            amount++;

        }
    }
}
