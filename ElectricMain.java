import java.util.*;

public class ElectricMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricityBoardMain eb = new ElectricityBoardMain();
        Map<String, String> electricityMap = new LinkedHashMap<>();

        System.out.println("Enter the number of connection records to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the connection records(ConnectionId:Connectiontype)");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(":");
            electricityMap.put(parts[0], parts[1]);
        }

        eb.setElectricityMap(electricityMap);

        System.out.println("Enter the Connection type to be searched");
        String searchType = sc.nextLine();
        int count = eb.findCountOfConnectionsBasedOnTheConnectionType(searchType);
        if (count == -1) {
            System.out.println("No Connection Ids were found for " + searchType.toLowerCase());
        } else {
            System.out.println("The count of connection Ids based on " + searchType.toUpperCase() + " are " + count);
        }

        System.out.println("Enter the Connection type to identify the Connection Ids");
        String filterType = sc.nextLine();
        List<String> ids = eb.findConnectionIdsBasedOnTheConnectionType(filterType);
        if (ids.isEmpty()) {
            System.out.println("No Connection Ids were found for the " + filterType.toLowerCase());
        } else {
            System.out.println("Connection Ids based on the " + filterType.toUpperCase() + " are");
            for (String id : ids) {
                System.out.println(id);
            }
        }
    }
}
