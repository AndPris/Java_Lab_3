import java.util.Arrays;

/**
 * Class which operates with array of Furniture objects.
 * @see Furniture
 */
public class FurnitureHandler {
    private final Furniture[] furnitureArray;

    /**
     * Constructor. Takes array of furniture objects.
     * @param furnitureArray array of furniture objects
     */
    public FurnitureHandler(Furniture[] furnitureArray) {
        this.furnitureArray = furnitureArray;
    }

    /**
     * Displays array of furniture objects in console.
     */
    public void displayFurnitureList() {
        for(Furniture furniture : furnitureArray)
            System.out.println(furniture);
    }

    /**
     * Sort array of furniture objects according to compareTo method implementation
     * @see Furniture#compareTo(Furniture) 
     */
    public void sortNameAscendingPriceDescending() {
        Arrays.sort(furnitureArray);
    }

    /**
     * Check if <code>furniture</code> object is present in array.
     * @param furniture object to find in array
     * @return boolean
     */
    public boolean contains(Furniture furniture) {
        for(Furniture furniture1 : furnitureArray) {
            if(furniture1.equals(furniture))
                return true;
        }

        return false;
    }
}
