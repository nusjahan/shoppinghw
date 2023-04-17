package shop;

import java.util.Arrays;

public class Customer extends Person {

    private Size size;
    private Product[] products;

    public Customer(String name) {
        super(name);
    }

    public Customer(String name, Size size, Product[] products) {
        super(name);
        this.size = size;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "size=" + size +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
