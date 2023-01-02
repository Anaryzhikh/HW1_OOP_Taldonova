public class Milk extends Product{
    public Milk(String name, double price, double fat) {
        super(name, price);
        this.setFat(fat);

    }
    private double fat;

    public double getFat() {
        return fat;
    }

    private void setFat(double fat) {
        this.fat = fat;
    }

    public String toString() {
        return String.format("%s - %s", super.toString(), fat);
    }
}
