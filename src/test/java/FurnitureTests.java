import nl.jqno.equalsverifier.EqualsVerifier;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FurnitureTests {
    private FurnitureHandler handler;

    @BeforeEach
    void setUp() {
        Furniture[] furnitureArray = new Furniture[4];
        furnitureArray[0] = new Furniture("Chair", "Brown", "Kitchen furniture", 1000, "Luka furniture");
        furnitureArray[1] = new Furniture("Chair", "Black", "Kitchen furniture", 800, "Luka furniture");
        furnitureArray[2] = new Furniture("Table", "Brown", "Kitchen furniture", 1500, "Luka furniture");
        furnitureArray[3] = new Furniture("Table", "White", "Kitchen furniture", 2000, "Luka furniture");
        handler = new FurnitureHandler(furnitureArray);
    }

    @Test
    void equalsTest() {
        EqualsVerifier.forClass(Furniture.class).verify();
    }

    @Test
    void containsTest1() {
        assertTrue(handler.contains(new Furniture("Chair", "Brown", "Kitchen furniture", 1000, "Luka furniture")));
    }

    @Test
    void containsTest2() {
        assertFalse(handler.contains(new Furniture("No such furniture", "Brown", "Kitchen furniture", 1000, "Luka furniture")));
    }
}
