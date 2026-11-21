package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] products;
    int size;

    public ProductBasket(int basket) {
        products = new Product[basket];
        this.size = 0;
    }

    public void add(Product product) {
        if (size < products.length) {
            products[size++] = product;
        } else  {
            System.out.println("Корзина заполнена");
        }
    }

    public int totalBasket() {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = result + products[i].getPrice();
        }
        return result;
    }

    public void printBasket() {
        if (size == 0) {
            System.out.println("В корзине пусто");
            return;
        }


        int specialCount = 0;
        for (int i = 0; i < size; i++) {
            System.out.println(products[i].toString());
            if (products[i].isSpecial()){
                specialCount++;
            }
        }
        System.out.println("Итого: " + totalBasket() + " руб.");
        System.out.println("Количество специальных товаров " + specialCount);
    }

    public void printResultSearchName(String name){
       if (searchName(name)){
           System.out.println("Товар: " + name + " найден");
       }else {
           System.out.println("Товар: " + name + " не найден");
       }
    }

    boolean searchName(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            if (products[i] != null){
                products[i] = null;
                size = 0;
            }
        }
        System.out.println("Корзина очищена");
    }

}
