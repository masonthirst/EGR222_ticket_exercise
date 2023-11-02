public class WalkupTicket extends Ticket {

    public WalkupTicket(double price, int number) {
        super(price, number);
    }

    public WalkupTicket(double price) {
        super((int) price);
    }

    public WalkupTicket(int number) {
        super(number);
    }

    public String toString() {
        return "Walk-up, " + super.toString();
    }

}
