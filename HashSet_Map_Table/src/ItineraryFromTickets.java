import java.util.HashMap;

public class ItineraryFromTickets {

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> reverseMap = new HashMap<>();

        for(String key : tickets.keySet()) {
            reverseMap.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()) {
            if(!reverseMap.containsKey(key))
                return key;
        }
        return null;
    }

    public static void itinerary(String start, HashMap<String, String> tickets) {
        while(tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.print(start + " -> ");
        System.out.println("End.");
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put ("Chennai", "Bengaluru");
        tickets.put ("Mumbai", "Delhi");
        tickets.put ("Goa", "Chennai");
        tickets.put ("Delhi", "Goa");

        String startCity = getStart(tickets);
        System.out.println("Start: " + startCity);
        itinerary(startCity, tickets);
    }
}
