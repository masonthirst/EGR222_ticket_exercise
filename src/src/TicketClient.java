public class TicketClient {
    public static void main(String[] args) {
    	// write your code here
        Ticket t1 = new Ticket(12.0, 123);
        System.out.println(t1);

        Ticket t2 = new Ticket(24.0);
        System.out.println(t2);

        Ticket t3 = new Ticket(456);
        System.out.println(t3);

        WalkupTicket wt1 = new WalkupTicket(15.0, 405);
        System.out.println(wt1);

        WalkupTicket wt2 = new WalkupTicket(5685);
        System.out.println(wt2);

        AdvanceTicket at1 = new AdvanceTicket(75568, 15.0, 30);
        System.out.println(at1);

        AdvanceTicket at2 = new AdvanceTicket(734, 15.0, 12);
        System.out.println(at2);

        AdvanceTicket at3 = new AdvanceTicket(001, 15.0, 9);
        System.out.println(at3);
    }
}
