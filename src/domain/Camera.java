package domain;

import util.Room;
import java.util.ArrayList;
public class Camera {
    private boolean isActualRoom = false;
    private Room idRoom;
    private ArrayList<Animatronic> animatronics = new ArrayList<>();

    public Camera(Room room){
        this.idRoom = room;
    }

    public boolean isActualRoom(Room room) {
            return isActualRoom;
    }

    public boolean isActualCamera(boolean actualCamera) {
        return actualCamera;
    }

    public ArrayList<Animatronic> getAnimatronics() {
        return animatronics;
    }
    public Room getRoom(){
        return idRoom;
    }


}
