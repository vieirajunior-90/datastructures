package colections;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class TheHashMap {

    public static void main(String[] args) {
        Map<String, BigDecimal> products = new HashMap<>();

        // Add products to the map
        products.put("Milk", new BigDecimal("2.50"));
        products.put("Bread", new BigDecimal("1.50"));
        products.put("Cheese", new BigDecimal("3.00"));
        products.put("Butter", new BigDecimal("1.00"));
        products.put("Coffee", new BigDecimal("4.00"));

        // Center the title
        System.out.println(StringUtils.repeat("-", 27));
        System.out.println(StringUtils.center("TABLE OF PRODUCTS", 27, ' '));
        System.out.println(StringUtils.repeat("-", 27));

        // Print the map
        for(Map.Entry<String, BigDecimal> entry : products.entrySet()) {
            System.out.printf("%-21s $%s%n", entry.getKey(), entry.getValue());
        }
        System.out.println(StringUtils.repeat("-", 27));

        // Get the product name
        System.out.println("Does the map contain the product 'Butter'? " + products.containsKey("Butter"));
        System.out.println("Does the map contain the product 'Yogurt'? " + products.containsKey("Yogurt"));

        // Get the total price of all products
        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Map.Entry<String, BigDecimal> entry : products.entrySet()) {
            totalPrice = totalPrice.add(entry.getValue());
        }
        System.out.println("The total price of all products is $" + totalPrice);

        // Get the product name with the highest price
        BigDecimal highestPrice = products.entrySet().stream().map(Map.Entry::getValue).reduce(BigDecimal.ZERO, BigDecimal::max);
        String highestPriceProduct = products.entrySet().stream()
                .filter(entry -> entry.getValue().equals(highestPrice)).findFirst().get().getKey();

        System.out.println("The product with the highest price is " + highestPriceProduct + " and the price is $" + highestPrice);

        // Get the product name with the lowest price
        BigDecimal lowestPrice = products.entrySet().stream().map(Map.Entry::getValue).reduce(BigDecimal::min).get();
        String lowestPriceProduct = products.entrySet().stream()
                .filter(entry -> entry.getValue().equals(lowestPrice)).findFirst().get().getKey();

        System.out.println("The product with the lowest price is " + lowestPriceProduct + " and the price is $" + lowestPrice);
    }
}


