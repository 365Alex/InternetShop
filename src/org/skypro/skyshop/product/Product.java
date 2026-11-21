package org.skypro.skyshop.product;

import org.skypro.skyshop.searchable.Searchable;

public abstract class Product implements Searchable {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getNameProduct() {
        return name;
    }
    public abstract int getPrice();
    public abstract boolean isSpecial();

    @Override
    public String searchTerm() {
        return getName();
    }

    @Override
    public String content() {
        return "PRODUCT";
    }

    @Override
    public String getName() {
        return getNameProduct();
    }
}
