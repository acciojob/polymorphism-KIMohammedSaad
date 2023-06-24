package com.driver;

public class Main {
    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        // Task 3: Calling the product method with two integers
        int result1 = p.product(2, 3);
        System.out.println("Result 1: " + result1);

        // Task 4: Calling the product method with three integers
        int result2 = p.product(2, 3, 4);
        System.out.println("Result 2: " + result2);

        // Task 5: Calling the product method with two doubles
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }
}
