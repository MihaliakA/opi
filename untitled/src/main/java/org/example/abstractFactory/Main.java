package org.example.abstractFactory;

interface Product {
    void display();
}

class ClothingProduct implements Product {
    private String type;

    public ClothingProduct(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Clothing Product: " + type);
    }
}

class ElectronicProduct implements Product {
    private String category;

    public ElectronicProduct(String category) {
        this.category = category;
    }

    @Override
    public void display() {
        System.out.println("Electronic Product: " + category);
    }
}

interface ResaleFactory {
    Product createClothingProduct();
    Product createElectronicProduct();
}

class HighEndResaleFactory implements ResaleFactory {
    @Override
    public Product createClothingProduct() {
        return new ClothingProduct("High-End Clothing");
    }

    @Override
    public Product createElectronicProduct() {
        return new ElectronicProduct("High-End Electronics");
    }
}

class LowCostResaleFactory implements ResaleFactory {
    @Override
    public Product createClothingProduct() {
        return new ClothingProduct("Low-Cost Clothing");
    }

    @Override
    public Product createElectronicProduct() {
        return new ElectronicProduct("Low-Cost Electronics");
    }
}
public class Main {
    public static void main(String[] args) {
        ResaleFactory highEndFactory = new HighEndResaleFactory();
        ResaleFactory lowCostFactory = new LowCostResaleFactory();

        Product highEndClothing = highEndFactory.createClothingProduct();
        Product highEndElectronics = highEndFactory.createElectronicProduct();

        Product lowCostClothing = lowCostFactory.createClothingProduct();
        Product lowCostElectronics = lowCostFactory.createElectronicProduct();

        highEndClothing.display();
        highEndElectronics.display();

        lowCostClothing.display();
        lowCostElectronics.display();
    }
}
