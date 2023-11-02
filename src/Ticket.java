public class Ticket {
    protected double price;
    protected int number;
    //protected int days;

    public Ticket(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public Ticket(int number) {
        this(50.0, number);
    }

    @Override
    public String toString() {
        return "Number: " + number + ", " + "Price: " + price;
    }
}
