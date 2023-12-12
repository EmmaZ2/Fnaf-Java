package implement;

import domain.Animatronic;

import util.Player;
import util.Room;
import util.Side;

import java.util.ArrayList;


public class Bonnie extends Animatronic {
    public Bonnie(int difficulty){
        super(difficulty);
        setRoute();
        setActualRoom(getRoute().get(0));
    }

    @Override
    protected void setRoute() {
        pathing.add(Room.CAM1);
        pathing.add(Room.CAM2);
        pathing.add(Room.CAM9);
        pathing.add(Room.CAM6);
        pathing.add(Room.CAM4);
        pathing.add(Room.CAM5);
        pathing.add(Room.CAM12);
    }

    @Override
    protected ArrayList<Room> getRoute() {
        return pathing;
    }

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
