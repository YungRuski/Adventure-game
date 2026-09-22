public class AdventureUI {

    public void startGame() {
        Adventure adventure = new Adventure();

        boolean goingIntoRooms = false;
        IO.println("You have entered into the adventure");
        IO.println("Type GO NORTH to go north, GO SOUTH to go south, GO WEST to go west, GO EAST to go east");
        IO.println("Type LOOK to look around");


        while (!goingIntoRooms) {

            String kommando = IO.readln();

            switch (kommando) {
                case "GO NORTH" -> {
                    IO.println("going north");
                }
                case "GO SOUTH" -> {
                    IO.println("going south");
                }
                case "GO WEST" -> {
                    IO.println("going west");
                }
                case "GO EAST" -> {
                    IO.println("going east");
                }
                case "LOOK" -> {
                    IO.println("Looking around");
                }
            }

        }
    }


}
