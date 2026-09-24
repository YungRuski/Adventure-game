public class Player {
    private Room currentRoom;

    public Player(Room firstRoom) {
        this.currentRoom = firstRoom;
    }

    public String lookAround(){
        return String.format("""
                %s
                %s
                """, currentRoom.getName(),currentRoom.getDescription());
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
}
