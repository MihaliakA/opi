package org.example.singletone;

public class ResaleShop {
    private static ResaleShop instance;

    private ResaleShop() {
    }

    public static ResaleShop getInstance() {
        if (instance == null) {
            instance = new ResaleShop();
        }
        return instance;
    }

    public void sellItem(String itemName, double price) {
        System.out.println("Продано: " + itemName + " за " + price + " грн");

    }

    public void buyItem(String itemName, double price) {
        System.out.println("Куплено: " + itemName + " за " + price + " грн");

    }

    public static void main(String[] args) {
        ResaleShop shop = ResaleShop.getInstance();
        ResaleShop shop1 = ResaleShop.getInstance();

        System.out.println(shop1.equals(shop));
        System.out.println(shop1 == shop);

        shop.sellItem("Стіл", 150.0);
        shop.buyItem("Крісло", 80.0);
    }
}

