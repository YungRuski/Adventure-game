import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private Item items;

    public Player(Room firstRoom) {
        this.currentRoom = firstRoom;
        this.inventory = new ArrayList<>();
    }

    public String lookAround() {
        if (currentRoom.getItems().isEmpty()) {
            return String.format("""
                    %s
                    %s
                    available items: none
                    """, currentRoom.getName(), currentRoom.getDescription());
        } else {
            return String.format("""
                    %s
                    %s
                    available items: %s
                    """, currentRoom.getName(), currentRoom.getDescription(), currentRoom.getItems());
        }
    }

    public boolean goNorth() {
        if (currentRoom.getNorth() != null) {
            currentRoom = currentRoom.getNorth();
            return true;
        } else {
            return false;
        }
    }

    public boolean goSouth() {
        if (currentRoom.getSouth() != null) {
            currentRoom = currentRoom.getSouth();
            return true;
        } else {
            return false;
        }
    }

    public boolean goEast() {
        if (currentRoom.getEast() != null) {
            currentRoom = currentRoom.getEast();
            return true;
        } else {
            return false;
        }
    }

    public boolean goWest() {
        if (currentRoom.getWest() != null) {
            currentRoom = currentRoom.getWest();
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void printInventory() {
        for (Item item : inventory) {
            IO.println(item);
        }
    }

    public boolean takeItem(String itemName) {
        for (Item item : currentRoom.getItems()) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                inventory.add(item);
                currentRoom.removeItem(item);
                return true;
            }

        }
        IO.println("There were no items");
        return false;
    }

    public boolean dropItem(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                currentRoom.addItem(item);
                inventory.remove(item);
                return true;
            }
        }
        IO.println("There were no items");
        return false;
    }

}
