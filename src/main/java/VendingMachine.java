import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class VendingMachine {
    private List<Product> products;

    private static List<Product> DEFAULT = new ArrayList<>(Arrays.asList(new Product("chips", 30)));

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public VendingMachine() {
        this(DEFAULT); // вызов конструктора
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        products.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    public List<Product> findByName(String name) {
        return finder(p -> p.getName() == name);
    }

    public List<Product> findByPrice(double price) {
        return finder(p -> p.getPrice() == price);
    }

    public List<Product> findByPriceRange(double p1, double p2) {
        return finder(p -> p.getPrice() < p2 && p.getPrice() > p1);
    }

    // лямбда - для сокращения кода
    private List finder (Function<Product, Boolean> f){
        List<Product> result = new ArrayList<>();
        products.forEach(i -> {
            if (Boolean.TRUE.equals(f.apply(i)))
                result.add(i);
        });
        return result;


    }
}
