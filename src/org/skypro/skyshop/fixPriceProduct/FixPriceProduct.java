package org.skypro.skyshop.fixPriceProduct;

import org.skypro.skyshop.product.Product;

public class FixPriceProduct extends Product {
    private static final int FIXPRICE = 78;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIXPRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString(){
        return getName() + " : " + getPrice() + " руб.";
    }
}
