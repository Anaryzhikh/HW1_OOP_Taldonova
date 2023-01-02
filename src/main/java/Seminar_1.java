import java.util.ArrayList;
import java.util.List;

public class Seminar_1 {
    public static void main(String[] args) {
        Product water = new Product("H2O", 15.3);
        System.out.println(water);

        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1);

        List<Product> goods = new ArrayList<>();
        goods.add(water);
        goods.add(new Product("wine", 120));
        goods.add(new Product("beer", 80));
        goods.add(new Soda("Fanta", 19, "orange"));
        goods.add(new Milk("Prostokvashino", 78, 3.5));
        goods.add(new Chocolate("AlpenGold", 85, "Milk with nuts"));

        VendingMachine mach2 = new VendingMachine(goods);
        System.out.println(mach2);
        System.out.println(mach2.findByName("Fanta"));
        System.out.println(mach2.findByPrice(120));
        System.out.println(mach2.findByPriceRange(15, 120));

    }

}
