public class AdvanceTicket extends Ticket {

    public AdvanceTicket(double price, int number, int daysPurchasedEarlier) {
        super(price, number);
        if (daysPurchasedEarlier > 10) {
            this.price *= 0.60;
        } else if (daysPurchasedEarlier > 0) {
            this.price *= 0.80;
        } else throw (new IllegalArgumentException("Must be greater than 0."));
    }

    public AdvanceTicket(double price, int daysPurchasedEarlier) {
        this(price, -1, daysPurchasedEarlier);
    }

    public AdvanceTicket(int number, int daysPurchasedEarlier) {
        this(50.0, number, daysPurchasedEarlier);
    }
    @Override
    public String toString() {
        return "Advanced, " + super.toString();
    }

}
