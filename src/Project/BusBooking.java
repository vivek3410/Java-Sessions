package Project;

import java.util.Scanner;

class BusTicket {
    int ticketId = 1;
    String passengerName;
    String source;
    String destination;
    boolean isBooked;
    double farePrice;

    static int ticketCount = 0;

    BusTicket(String passengerName,String source,String destination){
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.farePrice = 1000;
        this.ticketId = ticketId++;

        this.isBooked = true;
        ticketCount++;

        System.out.println("Ticket has booked successfully by name " + passengerName);
    }

    public void bookTicket(){
        if(isBooked){
            System.out.println("Ticket Already booked");
            return;
        }else{
            isBooked = true;
            System.out.println("Ticket booked successfully");
        }
    }

    public void cancelTicket(){
        if(!isBooked){
            System.out.println("Ticket is already canceled");
        }else{
            isBooked = false;
            System.out.println("Ticket has cancled");
        }
    }

    public void getTicketDetails(){

        System.out.println("====== Ticket Details ======");
        System.out.println("Ticket Id " + ticketId);
        System.out.println("Passenger Name: "+ passengerName);
        System.out.println("source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Fare Price: "+farePrice);
        System.out.println("Status: " + (isBooked ? "Booked" : "Not Booked"));
    }

    public void ticketsCount(){
        System.out.println("Number tickets booked: " + ticketCount);
    }

}



public class BusBooking {
    static BusTicket busTicket = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Bus Ticket booking system");
            System.out.println("1. Book a ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Print booking details");
            System.out.println("4. Print the tickets count");
            System.out.println("5. Exit");


            System.out.println("Enter the choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the passenger name");
                    String name = sc.next();

                    System.out.println("Enter the source");
                    String source = sc.next();

                    System.out.println("Enter the destination");
                    String destination = sc.next();

                    busTicket = new BusTicket(name, source, destination);
                    break;
                case 2:
                    if(busTicket == null){
                        System.out.println("Ticket is not booked");
                    }else{
                        busTicket.cancelTicket();
                    }
                    break;
                case 3:
                    if(busTicket == null){
                        System.out.println("Ticket is not booked");
                    }else{
                        busTicket.getTicketDetails();
                    }
                    break;
                case 4:
                    busTicket.ticketsCount();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid options");
            }
        }


    }
}
