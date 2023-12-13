package implement;

import domain.Animatronic;
import util.*;

import java.util.ArrayList;

public class GoldenFreddy extends Animatronic {
    public GoldenFreddy(int difficulty) throws Exception {
        super(difficulty);
        setRoute();
        setActualRoom(getRoute().get(0));
    }

    @Override
    protected void setRoute() {
        pathing.add(Room.CAM5);
        pathing.add(Room.CAM12);
    }

    @Override
    public ArrayList<Room> getRoute() {
        return pathing;
    }

    @Override
    protected void move(){
        changeCamera(actualRoom,getNextRoom());
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
