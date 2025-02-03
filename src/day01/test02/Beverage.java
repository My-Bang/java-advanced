package day01.test02;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name) {
        this.name = name;
    }
   public abstract void calcPrice();
    public void print(){
        for (int i = 0; i < 6; i++) {
            System.out.println(i+1 + "번째 판매 음료는 " + name + "이며, 가격은" + price);
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
