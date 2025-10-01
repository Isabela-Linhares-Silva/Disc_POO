package estudoProvaN12.application;

import estudoProvaN12.src.Product;

public class ProductTest {

    public static void main(String[] args) {
        Product produto1 = new Product(1, "lapis", 10.0);
        Product produto2 = new Product(2, "borracha", 5);
        Product produto3 =  new Product(3, "caneta", 2.0);

        produto1.desconto(10);
        produto2.desconto(10);
        produto3.desconto(10);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);        

    }
    
}
