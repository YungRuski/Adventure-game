public class Room {
    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public String getDescription(){
        return description;
    }

    public void setNorth(Room room) {
        this.north = room;
        north.south = this;
    }

    public Room getNorth() {
        return north;
    }

    public void setSouth(Room room) {
        this.south = room;
        south.north = this;
    }

    public Room getSouth() {
        return south;
    }

    public void setEast(Room room) {
        this.east = room;
        east.west = this;
    }

    public Room getEast() {
        return east;
    }

    public void setWest(Room room) {
        this.west = room;
        west.east = this;

    }

    public Room getWest() {
        return west;
    }
}
