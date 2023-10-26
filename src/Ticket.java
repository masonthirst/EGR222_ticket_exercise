public class Ticket {
    double price;
    int number;
    int days;

    public Ticket(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public Ticket(double price) {
        this(price, -1);
    }

    public Ticket(int number) {
        this(50.0, number);
    }

    @Override
    public String toString() {
        return "Number: " + number + ", " + "Price: " + price;
    }
}
