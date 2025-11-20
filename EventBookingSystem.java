//Event Ticket Booking System assignement by Carl Stultz
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EventBookingSystem {

    static class Event {
        private String name;
        private int availableTickets;
        private double price;
        private boolean memberDiscountAvailable;

        public Event(String name, int availableTickets, double price, boolean memberDiscountAvailable) {
            this.name = name;
            this.availableTickets = availableTickets;
            this.price = price;
            this.memberDiscountAvailable = memberDiscountAvailable;
        }

        public String getName() { return name; }
        public double getPrice() { return price; }

        public boolean isAvailable() {
            return availableTickets > 0;
        }

        public boolean bookTicket() {
            if (availableTickets > 0) {
                availableTickets--;
                return true;
            }
            return false;
        }

        public double calculatePrice(boolean isMember) {
            return price * ((isMember && memberDiscountAvailable) ? 0.9 : 1.0);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Event> events = new ArrayList<>();
        events.add(new Event("Concert", 5, 100.0, true));
        events.add(new Event("Football Match", 10, 80.0, true));
        events.add(new Event("Movie", 20, 12.0, false));

        List<String> bookingHistory = new ArrayList<>();

        System.out.println("Welcome to the Event Ticket Booking System!");
        System.out.println("Enter the event you'd like to book tickets for (Concert, Football Match, Movie):");
        String eventName = scan.nextLine();

        Event selectedEvent = findEvent(events, eventName);
        if (selectedEvent == null) {
            System.out.println("Sorry, the event you requested is not available.");
            printAvailableEvents(events);
            scan.close();
            return;
        }

        System.out.println("Are you a member? (yes/no):");
        String memberInput = scan.nextLine();
        boolean isMember = memberInput.equalsIgnoreCase("yes");

        double finalPrice = selectedEvent.calculatePrice(isMember);
        System.out.println("The price of the ticket is: $" + finalPrice);

        System.out.println("Enter your balance:");
        String balanceLine = scan.nextLine().replace("$", "").trim();
        double balance;
        try {
            balance = Double.parseDouble(balanceLine);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid balance entered. Exiting.");
            scan.close();
            return;
        }

        if (!(balance < finalPrice || !selectedEvent.isAvailable())) {
            if (selectedEvent.bookTicket()) {
                String record = "Booked: " + selectedEvent.getName() + " | Price: $" + finalPrice + " | Member: " + isMember;
                bookingHistory.add(record);
                System.out.println("Ticket booked successfully for the " + selectedEvent.getName() + "!");
                System.out.println("You have sufficient funds and the event is available. Booking confirmed.");
            } else {
                System.out.println("Booking failed: tickets sold out.");
            }
        } else {
            if (!selectedEvent.isAvailable()) System.out.println("Booking failed: event is sold out.");
            else System.out.println("Booking failed: insufficient funds.");
        }

        if (!bookingHistory.isEmpty()) {
            System.out.println("\nBooking History:");
            for (String rec : bookingHistory) System.out.println("- " + rec);
        }

        scan.close();
    }

    private static Event findEvent(List<Event> events, String name) {
        for (Event e : events) if (e.getName().equalsIgnoreCase(name)) return e;
        return null;
    }

    private static void printAvailableEvents(List<Event> events) {
        System.out.println("Available events:");
        for (Event e : events) {
            System.out.println("- " + e.getName() + " (Tickets left: " + (e.isAvailable() ? "Yes" : "Sold out") + ") - $" + e.getPrice());
        }
    }
}
