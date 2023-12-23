package org.example.builder;

class ResaleItem {
    private String itemName;
    private double price;
    private String category;
    private boolean used;

    private ResaleItem(Builder builder) {
        this.itemName = builder.itemName;
        this.price = builder.price;
        this.category = builder.category;
        this.used = builder.used;
    }

    @Override
    public String toString() {
        return "ResaleItem{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", used=" + used +
                '}';
    }

    static class Builder {
        private String itemName;
        private double price;
        private String category;
        private boolean used;

        public Builder(String itemName, double price) {
            this.itemName = itemName;
            this.price = price;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder used(boolean used) {
            this.used = used;
            return this;
        }

        public ResaleItem build() {
            return new ResaleItem(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ResaleItem item = new ResaleItem.Builder("Ліжко", 150.0)
                .category("Меблі")
                .used(true)
                .build();

        System.out.println(item);
    }
}
