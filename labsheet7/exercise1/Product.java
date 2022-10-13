package labsheet7.exercise1;


//Product.java
/*A simple instantiable class definition for a Product*/

public class Product {
    private int id;
    private String name;
    private String description;
    public static int count = 1000001 ;

    public Product( String name, String description) {
        setId(count);
        setName(name);
        setDescription(description);
        incrementCount();
    }

    public int getId() {
        return id;
    }
    public static void incrementCount(){
        count++;
    }
    public static int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Product details are as follows: id: " + getId() + "  name: " + getName() + "  description: " + getDescription();
    }
}
