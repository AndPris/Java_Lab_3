import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class which operates with list of Furniture objects.
 * @see Furniture
 */
public class FurnitureHandler {
    private final List<Furniture> furnitureList;

    /**
     * Constructor. Creates empty list for storing furniture objects.
     */
    public FurnitureHandler() {
        furnitureList = new ArrayList<>();
    }

    /**
     * Adds <code>furniture</code> object to list.
     * @param furniture furniture object to add
     */
    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    /**
     * Displays list of furniture objects in console.
     */
    public void displayFurnitureList() {
        furnitureList.forEach(System.out::println);
    }

    /**
     * Sort list of furniture objects according to compareTo method implementation
     * @see Furniture#compareTo(Furniture) 
     */
    public void sortNameAscendingPriceDescending() {
        Collections.sort(furnitureList);
    }

    /**
     * Check if <code>furniture</code> object is present in list.
     * @param furniture object to find in list
     * @return boolean
     */
    public boolean contains(Furniture furniture) {
        return furnitureList.contains(furniture);
    }
}
