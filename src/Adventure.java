public class Adventure {

Map map = new Map();
Room firstRoom = map.getFirstRoom();
Item firstItem = Item.take

Player player = new Player(firstRoom);



Player playerItem = new Player(takeItem());

public boolean goNorth(){
    return player.goNorth();
}
public boolean goSouth(){
    return player.goSouth();
}
public boolean goEast(){
    return player.goEast();
}
public boolean goWest(){
    return player.goWest();
}
public String lookAround(){
    return player.lookAround();
}
public boolean takeItem(){
    return player.takeItem();
}
}
