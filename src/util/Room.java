package util;

public enum Room {
    CAM1("1a"),
    CAM2("1b"),
    CAM3("1c"),
    CAM4("2a"),
    CAM5("2b"),
    CAM6("3"),
    CAM7("4a"),
    CAM8("4b"),
    CAM9("5"),
    CAM10("6"),
    CAM11("7"),
    CAM12("You"),
    CAM13("LeftDoor"),
    CAM14("RightDoor"),
    ; //Buena praxis


    //Para poder acceder a los datos
    private final String ROOM;

    Room(String room) {
        this.ROOM = room;
    }

    public String getRoom() {
        return ROOM;
    }

}
