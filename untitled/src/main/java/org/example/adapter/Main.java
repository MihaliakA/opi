package org.example.adapter;

interface OldMarketplace {
    void sellItem(String item);
}

class OldMarketplaceImpl implements OldMarketplace {
    @Override
    public void sellItem(String item) {
        System.out.println("Продаж " + item + " на старому майданчику");
    }
}

interface NewMarketplace {
    void buyProduct(String product);
}

class Adapter implements NewMarketplace {
    private OldMarketplace oldMarketplace;

    public Adapter(OldMarketplace oldMarketplace) {
        this.oldMarketplace = oldMarketplace;
    }

    @Override
    public void buyProduct(String product) {
        oldMarketplace.sellItem(product);
    }
}

public class Main {
    public static void main(String[] args) {
        OldMarketplace oldMarketplace = new OldMarketplaceImpl();
        NewMarketplace newMarketplace = new Adapter(oldMarketplace);

        newMarketplace.buyProduct("Старий товар");
    }
}

