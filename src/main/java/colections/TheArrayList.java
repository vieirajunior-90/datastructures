package colections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TheArrayList {

    static class Product {
        String name;
        Double price;

        public Product(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public Double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            return sb.append(String.format("%-10s", getName()))
                    .append(" ")
                    .append("$")
                    .append(String.format("%.2f", getPrice()))
                    .toString();
        }

        // Driver Program
        public static void main(String[] args) {
            Product p1 = new Product("Apple", 1.99);
            Product p2 = new Product("Orange", 2.99);
            Product p3 = new Product("Banana", 3.99);
            Product p4 = new Product("Rice", 7.50);
            Product p5 = new Product("Sugar", 2.25);

            List<Product> products = new ArrayList<>();

            // Add products to the list
            products.add(p1);
            products.add(p2);
            products.add(p3);
            products.add(p4);
            products.add(p5);

            // Print the list
            System.out.println("Products:");
            for (Product p : products) {
                System.out.println("\t" + p);
            }

            // Remove the first product
            System.out.println("\nRemove the first product:");
            products.remove(0);
            for (Product p : products) {
                System.out.println("\t" + p);
            }

            // Get the total price of the products
            System.out.println("\nTotal price of the products:");
            Double total = products.stream().reduce(0.0, (sum, p) -> sum + p.getPrice(), Double::sum);
            System.out.println("\t$" + total);

            // Get the product with the highest price
            System.out.println("\nProduct with the highest price:");
            Product highest = products.stream().max(Comparator.comparing(Product::getPrice)).orElseThrow();
            System.out.println("\t" + highest);

            // Get the product with the lowest price
            System.out.println("\nProduct with the lowest price:");
            Product lowest = products.stream().min(Comparator.comparing(Product::getPrice)).orElseThrow();
            System.out.println("\t" + lowest);

            // Get the average price of the products
            System.out.println("\nAverage price of the products:");
            double average = products.stream().mapToDouble(Product::getPrice).average().orElseThrow();
            System.out.println("\t$" + String.format("%.2f", average));

            // Get the size of the list
            System.out.println("\nSize of the list:");
            int size = products.size();
            System.out.println("\t" + size + " products");
        }
    }
}
