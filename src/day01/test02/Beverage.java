package day01.test02;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name) {
        this.name = name;
        calcPrice();
    }

    public abstract void calcPrice();

    public void print(int i) {
        System.out.println(i + "번째 판매 음료는 " + name + "이며, 가격은" + price);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
