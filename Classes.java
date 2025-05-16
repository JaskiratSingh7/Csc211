import java.util.List;

public class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + " ($" + price + ") - " + category;
    }
}

public class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price, "Electronics");
    }
}

public class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price, "Clothing");
    }
}

public class Grocery extends Product {
    public Grocery(String name, double price) {
        super(name, price, "Grocery");
    }
}

public class User {
    String username;

    public User(String username) {
        this.username = username;
    }
}

public class Customer extends User {
    public Customer(String username) {
        super(username);
    }
}

public class Admin extends User {
    public Admin(String username) {
        super(username);
    }
}


public class Order {
    Customer customer;
    List<Product> products;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    public double getTotal() {
        double subtotal = products.stream().mapToDouble(p -> p.price).sum();
        double tax = subtotal * 0.1;
        double shipping = 5.0;
        return subtotal + tax + shipping;
    }
}
