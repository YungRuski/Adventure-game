import java.util.ArrayList;

public class Item {

    private String itemName;
    private String itemDescription;


    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getitemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    @Override
    public String toString() {
        return itemDescription;
    }
}
