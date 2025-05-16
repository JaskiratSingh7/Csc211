import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Phone", 500));
        products.add(new Clothing("T-Shirt", 20));
        products.add(new Grocery("Milk", 3));

        // Filter using lambda
        Predicate<Product> isClothing = p -> p.category.equals("Clothing");
        List<Product> clothingItems = products.stream().filter(isClothing).collect(Collectors.toList());

        System.out.println("Clothing items:");
        clothingItems.forEach(System.out::println);

        // Sort products by price
        System.out.println("\nSorted by price:");
        products.stream()
                .sorted(Comparator.comparingDouble(p -> p.price))
                .forEach(System.out::println);

        // Create order
        Customer c = new Customer("john");
        List<Product> cart = Arrays.asList(products.get(0), products.get(1));
        Order order = new Order(c, cart);
        System.out.println("\nOrder total: $" + order.getTotal());
    }
}
