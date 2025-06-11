import java.util.*;

public class ElectricityBoardMain {
    private Map<String, String> electricityMap;

    public Map<String, String> getElectricityMap() {
        return electricityMap;
    }

    public void setElectricityMap(Map<String, String> electricityMap) {
        this.electricityMap = electricityMap;
    }

    public int findCountOfConnectionsBasedOnTheConnectionType(String connectionType) {
        int count = 0;
        for (String value : electricityMap.values()) {
            if (value.equalsIgnoreCase(connectionType)) {
                count++;
            }
        }
        return count == 0 ? -1 : count;
    }

    public List<String> findConnectionIdsBasedOnTheConnectionType(String connectionType) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : electricityMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(connectionType)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
