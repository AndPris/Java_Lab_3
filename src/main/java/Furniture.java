public class Furniture implements Comparable<Furniture> {
    private final String name;
    private final String color;
    private final String type;
    private final int price;
    private final String manufacturer;

    public Furniture(String name, String color, String type, int price, String manufacturer) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Type: " + type + ", Price: " + price + ", Manufacturer: " + manufacturer;
    }

    @Override
    public int compareTo(Furniture o) {
        if(this.name.compareTo(o.name) > 0)
            return 1;

        if(this.name.compareTo(o.name) < 0)
            return -1;

        if(this.price > o.price)
            return -1;
        if(this.price < o.price)
            return 1;

        return 0;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o)
            return true;

        if(!(o instanceof Furniture))
            return false;

        Furniture furniture = (Furniture) o;

        if(price != furniture.price)
            return false;

        if(name != null && !name.equals(furniture.name))
            return false;

        if(name == null && furniture.name != null)
            return false;

        if(color != null && !color.equals(furniture.color))
            return false;

        if(color == null && furniture.color != null)
            return false;

        if(type != null && !type.equals(furniture.type))
            return false;

        if(type == null && furniture.type != null)
            return false;

        if(manufacturer != null && !manufacturer.equals(furniture.manufacturer))
            return false;

        if(manufacturer == null && furniture.manufacturer != null)
            return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = 31;
        result += price;
        result += name == null ? 0 : name.hashCode();
        result += color == null ? 0 : color.hashCode();
        result += type == null ? 0 : type.hashCode();
        result += manufacturer == null ? 0 : manufacturer.hashCode();
        return result;
    }
}
