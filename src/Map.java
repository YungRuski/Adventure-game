public class Map {

    public Room currentRoom;

    public Map() {
        makeRooms();
    }

    private void makeRooms() {

        Room room1 = new Room("Room 1", "A room with no distinct features, except two doors.");
        Room room2 = new Room("Room 2", "A room with no distinct features, except two doors.");
        Room room3 = new Room("Room 3", "A room with no distinct features, except two doors.");
        Room room4 = new Room("Room 4", "A room with no distinct features, except two doors.");
        Room room5 = new Room("Room 5", "A room with no distinct features, except one door.");
        Room room6 = new Room("Room 6", "A room with no distinct features, except two doors.");
        Room room7 = new Room("Room 7", "A room with no distinct features, except two doors.");
        Room room8 = new Room("Room 8", "A room with no distinct features, except three doors.");
        Room room9 = new Room("Room 9", "A room with no distinct features, except two doors.");

        currentRoom = room1;

        room1.setEast(room2);
        room2.setEast(room3);
        room3.setSouth(room6);
        room6.setSouth(room9);
        room9.setWest(room8);
        room8.setNorth(room5);
        room8.setWest(room7);
        room7.setNorth(room4);
        room4.setNorth(room1);
    }
}