public class Chocolate extends Product{
    public Chocolate(String name, double price, String type) {
        super(name, price);
        this.getType(type);
    }

    private String type;

    public String getType(String type) {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return String.format("%s - %s", super.toString(), type);
    }
}
