import jdk.swing.interop.SwingInterOpUtils;

public class AdventureUI {

    public void startGame() {
        Adventure adventure = new Adventure();


        boolean goingIntoRooms = false;
        IO.println("You have entered the most amazing dungeon!!!!");
        IO.println("-----------------------------------------------");
        printHelpMenu();


        while (!goingIntoRooms) {

            String input = IO.readln().toUpperCase();

            String[] commandArray = input.split(" ");
            /*
              COMMAND   ARGUMENT
              go        north
              go        south
              take      sword
              drop      key
              inventory
              look
             */

            String command = commandArray[0];
            String argument = "";
            if(commandArray.length > 1){

                argument = commandArray[1];
            }

            switch (command) {
                case "GO" -> go(argument, adventure);
                case "LOOK" -> IO.println(adventure.lookAround());
                case "EXIT" -> goingIntoRooms = true;
                case "HELP" -> printHelpMenu();
                case "TAKE" -> {
                    if (adventure.takeItem(argument)) {
                        IO.println("Picking up item");
                    } else {
                        IO.println("intet at samle op");
                    }
                }
                case "DROP" -> {
                    if(adventure.dropItem(argument)) {
                        IO.println("Dropping item");
                    } else {
                        IO.println("Nothing to drop");
                    }
                }
                case "INVENTORY" -> {
                    adventure.printInventory();
                }
                default -> {}
            }

        }
    }

    public void printHelpMenu() {
        IO.println("Type GO NORTH to go north, GO SOUTH to go south, GO WEST to go west, GO EAST to go east");
        IO.println("Type LOOK to look around");
        IO.println("Type EXIT to quit the program.");
        IO.println("Type HELP to get all commands.");
    }

    private void go(String direction, Adventure adventure) {
        switch (direction) {
            case "NORTH" -> {
                IO.println(adventure.goNorth() ? "going north" : "Could not go that way");
            }
            case "SOUTH" -> {
                IO.println(adventure.goSouth() ? "going south" : "Could not go that way");
            }
            case "EAST" -> {
                IO.println(adventure.goEast() ? "going east" : "Could not go that way");
            }
            case "WEST" -> {
                IO.println(adventure.goWest() ? "going west" : "Could not go that way");
            }
        }
    }



}
