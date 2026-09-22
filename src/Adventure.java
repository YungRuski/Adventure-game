public class Adventure {

   private Room firstRoom;
   private Room currentRoom;

    public Adventure (Room firstRoom){
        this.currentRoom = firstRoom;
    }
    public boolean nextRoom(){

    }

   public Adventure (){
    makeRooms();
   }

    public Room getFirstRoom() {
        return firstRoom;
    }


private void makeRooms (){

    Room room1 = new Room("Room 1", "A room with no distinct features, except two doors.");
    Room room2 = new Room("Room 2", "A room with no distinct features, except two doors.");
    Room room3 = new Room("Room 3", "A room with no distinct features, except two doors.");
    Room room4 = new Room("Room 4", "A room with no distinct features, except two doors.");
    Room room5 = new Room("Room 5", "A room with no distinct features, except one door.");
    Room room6 = new Room("Room 6", "A room with no distinct features, except two doors.");
    Room room7 = new Room("Room 7", "A room with no distinct features, except two doors.");
    Room room8 = new Room("Room 8", "A room with no distinct features, except three doors.");
    Room room9 = new Room("Room 9", "A room with no distinct features, except two doors.");

    firstRoom = room1;

    room1.set
}






}
