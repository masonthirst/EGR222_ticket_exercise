public class AdvanceTicket extends Ticket {

    public AdvanceTicket(int number, int daysPurchasedEarlier, double price) {
        super(price);
        if (daysPurchasedEarlier > 10) {
            this.price *= 0.40;
        } else if (daysPurchasedEarlier > 0) {
            this.price *= 0.20;
        } else {
            throw(IllegalArgumentException("Must be greater than 0."))
        }
    }

    public AdvanceTicket(double price, int number) {
        super(price, number);
    }

    public AdvanceTicket(double price, int daysPurchasedEarlier) {
        this(price, -1, daysPurchasedEarlier);
    }

    public AdvanceTicket(int number, int daysPurchasedEarlier) {
        this(50.0, number, daysPurchasedEarlier);
    }

    public String toString() {
        return "Advanced ticket, " + super.toString();
    }

}
