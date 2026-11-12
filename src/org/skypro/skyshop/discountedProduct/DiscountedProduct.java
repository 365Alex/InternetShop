package org.skypro.skyshop.discountedProduct;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    private final int basisPrice;
    private final int percent;

    public DiscountedProduct(String name, int basisPrice, int percent) {
        super(name);
        this.basisPrice = basisPrice;
        this.percent = percent;
    }

    @Override
    public int getPrice() {
        return basisPrice - (basisPrice*percent/100);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
    @Override
    public String toString(){
        return getName() + "(цена со скидкой) : " + getPrice() + " руб. ("
                + basisPrice + "руб.)" + "(скидка: " + percent + "%)";
    }
}
