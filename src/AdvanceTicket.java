public class AdvanceTicket extends Ticket {


    public AdvanceTicket(double price, int number) {
        super(price, number);
    }

    public AdvanceTicket(double price) {
        super(price);
    }

    public AdvanceTicket(int number) {
        super(number);
    }

    public AdvanceTicket(int days, double price) {
        super(price);
        if (days > 10) {
            price *= 0.40;
        } else if (days < 10) {
            price *= 0.20;
        }
    }
}
