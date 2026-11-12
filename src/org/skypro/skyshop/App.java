package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.discountedProduct.DiscountedProduct;
import org.skypro.skyshop.fixPriceProduct.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.simpleProduct.SimpleProduct;

public class App {
    public static void main(String[] args) {
        Product one = new DiscountedProduct("сыр", 260, 2);
        Product two = new SimpleProduct("макароны", 64);
        Product three = new DiscountedProduct("рыба", 210, 3);
        Product four = new FixPriceProduct("конфеты");
       ProductBasket basket = new ProductBasket(4);
       basket.add(one);
       basket.add(two);
       basket.add(three);
       basket.add(four);
       basket.printBasket();
       basket.printResultSearchName("сало");
       basket.clear();
       basket.printBasket();
        System.out.println();
    }


}