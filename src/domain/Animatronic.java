package domain;
import util.CameraController;
import util.Player;
import util.Room;
import util.Side;

import java.util.ArrayList;

public abstract class Animatronic {
    private final static int MAX_DIFFICULTY = 20;
    private int difficulty;
    protected Room actualRoom;
    protected Side doorSide;
    CameraController cameraController= CameraController.getInstance();
    //Singleton
    protected ArrayList<Room> pathing = new ArrayList<>();

    protected Animatronic(int difficulty){
        setDifficulty(difficulty);
        setActualRoom(actualRoom);
        setDoorSide(doorSide);
    }

    public void setDoorSide(Side doorSide) {
        this.doorSide=doorSide;
    }
 public Side getDoorSide() {return doorSide;}

    private void setDifficulty(int difficulty) throws RuntimeException {
        if (difficulty < 0 || difficulty > 20) {
            throw new RuntimeException("La dificultad debe ser entre 0 y 20");
        } else {
            this.difficulty = difficulty;
        }
    }
    protected abstract void setRoute();

    protected abstract ArrayList<Room> getRoute();

    protected abstract void move() throws InterruptedException;


    protected void changeCamera(Room last, Room next) {

        ArrayList<Camera> cameras = CameraController.getInstance().getCameras();

        cameras.forEach(
                camera -> {
                    if (camera.getRoom().equals(last)) {
                        camera.getAnimatronics().remove(this);
                    }
                    if (camera.getRoom().equals(next)) {
                        camera.getAnimatronics().add(this);
                    }
                }
        );
    }

    protected boolean movementTry() {

        int x = (int) (Math.random() * MAX_DIFFICULTY + 1);
        return (x <= difficulty);
    }

    protected void setActualRoom(Room actualRoom) {
        if (getRoute().contains(actualRoom)) {
            this.actualRoom = actualRoom;
        }
    }

    protected Room getNextRoom() {
        for (int i = 0; i < getRoute().size(); i++) {
            if (i == getRoute().size()) {
                return getRoute().get(0);
            }
            if (getRoute().get(i).equals(actualRoom)) {
                return getRoute().get(i + 1);
            }

        }
        return null;
    }

    protected Room getPreviousRoom() {
        int routeSize = getRoute().size();
        for (int i = routeSize; i > 0; i--) {
            if (i == 0) {
                return getRoute().get(routeSize - 1);
            }
            if (getRoute().get(i).equals(actualRoom)) {
                return getRoute().get(i - 1);
            }

        }
        return null;
    }
    public Room getActualRoom() {return actualRoom;}
    protected abstract String getName();
    protected void killOrReturn(){

    }


    protected void timedMove(){
        //TODO por tiempo
    }
}

