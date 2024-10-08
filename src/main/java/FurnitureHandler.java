import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FurnitureHandler {
    private final List<Furniture> furnitureList;

    public FurnitureHandler() {
        furnitureList = new ArrayList<Furniture>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void displayFurnitureList() {
        furnitureList.forEach(System.out::println);
    }

    public void sortNameAscendingPriceDescending() {
        Collections.sort(furnitureList);
    }

    public boolean contains(Furniture furniture) {
        return furnitureList.contains(furniture);
    }
}
