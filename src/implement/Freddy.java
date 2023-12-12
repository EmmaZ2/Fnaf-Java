package implement;

import domain.Animatronic;
import util.Room;

import java.util.ArrayList;

public class Freddy extends Animatronic {

    public Freddy(int difficulty) throws Exception {
        super(difficulty);
        setRoute();
        setActualRoom(getRoute().get(0));
    }

    @Override
    protected void setRoute() {
        pathing.add(Room.CAM1);
        pathing.add(Room.CAM2);
        pathing.add(Room.CAM11);
        pathing.add(Room.CAM10);
        pathing.add(Room.CAM7);
        pathing.add(Room.CAM8);
        pathing.add(Room.CAM12);
    }

    @Override
    public ArrayList<Room> getRoute() {
        return pathing;
    }
    @Override
    protected void move () {
        if (movementTry()){
            int x = (int)(Math.random()*2+1);
            if(x==2) {
                changeCamera(actualRoom, getNextRoom());
            }else{
                changeCamera(actualRoom,getPreviousRoom());
            }
        }
    }

}
