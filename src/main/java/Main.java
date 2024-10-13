
/*
   Мій номер у списку групи - 18.
   С11 = 18 % 11 = 7
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Furniture[] furnitureArray = new Furniture[7];
        furnitureArray[0] = new Furniture("Chair", "Brown", "Kitchen furniture", 1000, "Luka furniture");
        furnitureArray[1] = new Furniture("Chair", "Black", "Kitchen furniture", 800, "Luka furniture");
        furnitureArray[2] = new Furniture("Table", "Brown", "Kitchen furniture", 1500, "Luka furniture");
        furnitureArray[3] = new Furniture("Table", "White", "Kitchen furniture", 2000, "Luka furniture");
        furnitureArray[4] = new Furniture("Cupboard", "Black", "Kitchen furniture", 2000, "Luka furniture");
        furnitureArray[5] = new Furniture("Cupboard", "White", "Kitchen furniture", 2500, "Luka furniture");
        furnitureArray[6] = new Furniture("Cupboard", "Brown", "Kitchen furniture", 1800, "Luka furniture");

        FurnitureHandler handler = new FurnitureHandler(furnitureArray);

        System.out.println("Initial array:");
        handler.displayFurnitureList();
        System.out.println("\n==================================================\n");
        handler.sortNameAscendingPriceDescending();
        System.out.println("Array sorted by name ascending and price descending:");
        handler.displayFurnitureList();
        System.out.println("\n==================================================\n");

        String name;
        String color;
        String type;
        int price;
        String manufacturer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details of furniture to find: ");
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Color: ");
        color = scanner.nextLine();
        System.out.println("Type: ");
        type = scanner.nextLine();
        System.out.println("Price: ");
        price = InputHandler.getUserInput(1);
        System.out.println("Manufacturer: ");
        manufacturer = scanner.nextLine();

        Furniture furniture = new Furniture(name, color, type, price, manufacturer);
        if(handler.contains(furniture))
            System.out.println("\nFurniture found!");
        else
            System.out.println("\nFurniture not found!");
    }
}
