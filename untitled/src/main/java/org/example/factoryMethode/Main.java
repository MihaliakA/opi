package org.example.factoryMethode;

interface ResaleItemFactory {
    ResaleItem createItem();
}

class ResaleItem {
    private String name;

    public ResaleItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Item: " + name);
    }
}

class BookFactory implements ResaleItemFactory {
    @Override
    public ResaleItem createItem() {
        return new ResaleItem("Book");
    }
}

class ClothingFactory implements ResaleItemFactory {
    @Override
    public ResaleItem createItem() {
        return new ResaleItem("Clothing");
    }
}
public class Main {
    public static void main(String[] args) {
        ResaleItemFactory bookFactory = new BookFactory();
        ResaleItem book = bookFactory.createItem();
        book.display();

        ResaleItemFactory clothingFactory = new ClothingFactory();
        ResaleItem clothing = clothingFactory.createItem();
        clothing.display();
    }
}

