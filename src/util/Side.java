package util;

public enum Side {

    Right("Right"),
    Left("Left"),
    ;
    //Para poder acceder a los datos
    private final String Side;

    Side(String room) {
        this.Side = room;
    }

    public String getSide() {
        return Side;
    }
}
