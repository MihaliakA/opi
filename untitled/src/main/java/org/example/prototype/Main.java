package org.example.prototype;

class Item implements Cloneable {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Item originalItem = new Item("Ліжко", 200.0);

        Item clonedItem = originalItem.clone();

        System.out.println("Оригінальний об'єкт: " + originalItem.getName() + ", Ціна: " + originalItem.getPrice());
        System.out.println("Клонований об'єкт: " + clonedItem.getName() + ", Ціна: " + clonedItem.getPrice());


        clonedItem.setPrice(180.0);

        System.out.println("Оригінальний об'єкт після зміни ціни: " + originalItem.getPrice());
        System.out.println("Клонований об'єкт після зміни ціни: " + clonedItem.getPrice());
    }
}


