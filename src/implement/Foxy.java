package implement;

import domain.Animatronic;
import util.Room;
import util.Side;

import java.util.ArrayList;

public class Foxy extends Animatronic {
    private int sceneState;
    public Foxy(int difficulty){
        super(difficulty);
        setRoute();
        setActualRoom(getRoute().getFirst());
    }

    @Override
    protected void setRoute() {
        pathing.add(Room.CAM3);
        pathing.add(Room.CAM4);
        pathing.add(Room.CAM12);
    }

    @Override
    public ArrayList<Room> getRoute() {
        return pathing;
    }
    @Override
    protected void move () {
        if (movementTry()){
            switch (sceneState){
                case 0 : sceneState++;
                case 1: sceneState++;
                case 2 : sceneState++;
                case 3 : changeCamera(actualRoom,getNextRoom());
            }
        if(getActualRoom().equals(Room.CAM4)){
            setDoorSide(Side.Left);
        }
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }




    /*
      //la idea es hacer algo asi
        private void movement () {
            CameraController cam = new CameraController();
            cam.getCameras().forEach(
                    (camera -> {
                        camera.getAnimatronics().add(new Foxy("", ""))
                    })
            );
        }
    */
    //Esto es un ejemplo solo, la idea es obtener las camaras y mirar si alguna de ellas hace match con el path de foxy,
    // en caso que lo hago pillas la lista de los animatronicos de la cam y añades a foxy, solo habria que hacer que el get camera del camara controller
    // sea estatico para que solo haya una instancia el actual room te sobra, en verdad ya sabes donde estuvo foxy antes de moverse
    // para eso tienes el pathing, de modo que si tu tienes la lista [1,2,3,4] sabes que haciendo get de [i] tienes la posicion del array
    // si haces [i-1] tienes la posicion anterior, ergo la cam anterior de la cual hay que eliminar a foxy mas claro con este ejemplo ? uwu
}