package util;

public class Office {
    private static Office instance;

    public static Office getInstance() {
        if (instance == null) {
            instance = new Office();
        }
        return instance;
    }
    private Office(){
        Door leftDoor = new Door(Side.Left);
        Door rightDoor = new Door(Side.Right);
    }
}
