package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product one = new Product("сыр", 120);
        Product two = new Product("макароны", 64);
        Product three = new Product("рыба", 210);
        Product four = new Product("конфеты", 156);
       ProductBasket basket = new ProductBasket(3);
       basket.add(one);
       basket.add(two);
       basket.add(three);
       basket.add(four);
       basket.printBasket();
       basket.printResultSearchName("рыба");
       basket.clear();
       basket.printBasket();
    }
}