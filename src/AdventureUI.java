public class AdventureUI {

    public void startGame() {
        Adventure adventure = new Adventure();


        boolean goingIntoRooms = false;
        IO.println("You have entered the most amazing dungeon!!!!");
        IO.println("-----------------------------------------------");
        printHelpMenu();


        while (!goingIntoRooms) {

            String kommando = IO.readln();

            switch (kommando) {
                case "GO NORTH" -> {
                    if (adventure.goNorth()) {
                        IO.println("Going north");
                    } else {
                        IO.println("You cannot go that way.");
                    }
                }
                case "GO SOUTH" -> {
                    if (adventure.goSouth()) {
                        IO.println("Going south.");
                    } else {
                        IO.println("You cannot go that way.");
                    }

                }
                case "GO WEST" -> {
                    if (adventure.goWest()) {
                        IO.println("Going west.");
                    } else {
                        IO.println("You cannot go that way.");
                    }

                }
                case "GO EAST" -> {
                    if(adventure.goEast()){
                        IO.println("Going east.");
                    } else {
                        IO.println("You cannot go that way.");
                    }

                }
                case "LOOK" -> {
                    IO.println(adventure.lookAround());
                }
                case "EXIT" -> {
                    goingIntoRooms = true;
                }
                case "HELP" -> {
                    printHelpMenu();
                }
                case "TAKE" -> {
                    if (adventure.takeItem()) {
                        IO.println("Picking up item");
                    } else {
                        IO.println("intet at samle op");
                    }
                }
            }

        }
    }

    public void printHelpMenu() {
        IO.println("Type GO NORTH to go north, GO SOUTH to go south, GO WEST to go west, GO EAST to go east");
        IO.println("Type LOOK to look around");
        IO.println("Type EXIT to quit the program.");
        IO.println("Type HELP to get all commands.");
    }

}
