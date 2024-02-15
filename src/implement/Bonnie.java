package implement;
import domain.Animatronic;
import util.Player;
import util.Room;
import java.util.ArrayList;



public class Bonnie extends Animatronic {
    public Bonnie(int difficulty) throws InterruptedException {
        super(difficulty);
        setRoute();
        setActualRoom(getRoute().get(0));
        while (Player.getInstance().isAlive()) {
            move();
        }
        }


    @Override
    protected void setRoute() {
        pathing.add(Room.CAM1);
        pathing.add(Room.CAM2);
        pathing.add(Room.CAM9);
        pathing.add(Room.CAM6);
        pathing.add(Room.CAM4);
        pathing.add(Room.CAM5);
        pathing.add(Room.CAM13);
        pathing.add(Room.CAM12);

    }

    @Override
    protected ArrayList<Room> getRoute() {
        return pathing;
    }

   /* protected void move () {
        if (movementTry()){
            int x = (int)(Math.random()*2+1);
            if(x==2) {
                System.out.println(getClass().getSimpleName() +"has moved");
                changeCamera(actualRoom, getNextRoom());
            }else if(!actualRoom.equals(getRoute().getFirst())){
                System.out.println(getClass().getSimpleName() +"has moved");
                changeCamera(actualRoom,getPreviousRoom());
            }
        }
    }*/
   protected void move () {
       if (movementTry()) {
           System.out.println(getClass().getSimpleName() +"has moved");
           changeCamera(actualRoom, getNextRoom());
       }
   }

    @Override
    public String getName() {

        return getClass().getSimpleName();
    }

}
