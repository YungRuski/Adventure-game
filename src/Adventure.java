public class Adventure {

    Map map = new Map();
    Room firstRoom = map.getFirstRoom();

    Player player = new Player(firstRoom);


    public boolean goNorth() {
        return player.goNorth();
    }

    public boolean goSouth() {
        return player.goSouth();
    }

    public boolean goEast() {
        return player.goEast();
    }

    public boolean goWest() {
        return player.goWest();
    }

    public String lookAround() {
        return player.lookAround();
    }

    public boolean takeItem(String itemName) {
        return player.takeItem(itemName);
    }

    public boolean dropItem(String itemName) {
        return player.dropItem(itemName);
    }

    public void printInventory() {
        player.printInventory();
    }

    public void printHealth() {
        IO.println(player.getHealthDescription());
    }

    public String eat(String itemName) {
        if (player.eat(itemName) == EatResult.EATEN) {
            return "You are eating " + itemName;
        }
        if (player.eat(itemName) == EatResult.NOT_FOOD) {
            return "You can't eat a " + itemName;
        }
        return EatResult.NOT_FOUND.toString();

    }
}
