public class TicketClient {
    public static void main(String[] args) {
    	// write your code here
        Ticket t1 = new Ticket(123);
        System.out.println(t1);

        Ticket t2 = new Ticket(689876);
        System.out.println(t2);

        Ticket t3 = new Ticket(456);
        System.out.println(t3);

        WalkupTicket wt1 = new WalkupTicket(405);
        System.out.println(wt1);

        WalkupTicket wt2 = new WalkupTicket(5685);
        System.out.println(wt2);

        AdvanceTicket at1 = new AdvanceTicket(75568, 10);
        System.out.println(at1);

        AdvanceTicket at2 = new AdvanceTicket(17, 12);
        System.out.println(at2);

        AdvanceTicket at3 = new AdvanceTicket(18, 9);
        System.out.println(at3);

        StudentAdvanceTicket st1 = new StudentAdvanceTicket(75568, 30);
        System.out.println(st1);

        StudentAdvanceTicket st2 = new StudentAdvanceTicket(734, 12);
        System.out.println(st2);
    }
}
