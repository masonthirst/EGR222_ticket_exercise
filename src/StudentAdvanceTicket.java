public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(double price, int number, int daysPurchasedEarlier) {
        super(price, number, daysPurchasedEarlier);
        this.price *= 0.5;
    }

    public StudentAdvanceTicket(double price, int daysPurchasedEarlier) {
        this(price, -1, daysPurchasedEarlier);
    }

    public StudentAdvanceTicket(int number, int daysPurchasedEarlier) {
        this(50.0, daysPurchasedEarlier);
    }

    @Override
    public String toString() {
        return super.toString() + " (Student ID required)";
    }
}
