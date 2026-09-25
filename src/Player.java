import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private Item items;

    public Player(Room firstRoom) {
        this.currentRoom = firstRoom;
        this.inventory = new ArrayList<>();
    }

    public String lookAround(){
        return String.format("""
                %s
                %s
                available items: %s
                """, currentRoom.getName(),currentRoom.getDescription(), currentRoom.getItems());
    }

    public boolean goNorth(){
        if (currentRoom.getNorth() != null){
            currentRoom = currentRoom.getNorth();
            return true;
        } else{
            return false;
        }
    }
    public boolean goSouth(){
        if (currentRoom.getSouth() != null){
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

    public boolean goWest(){
        if(currentRoom.getWest() != null){
            currentRoom = currentRoom.getWest();
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Item> getInventory(){
        return inventory;
    }

    public void takeItem(Item item){
        inventory.add(item);
    }
    public void dropItem(Item item){
        inventory.remove(item);
    }
}
