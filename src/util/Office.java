package util;

import domain.Animatronic;
import domain.Camera;

import java.util.ArrayList;

import static util.Room.CAM5;

public class Office {
    private ArrayList <Animatronic> leftSide;
    private ArrayList <Animatronic> rightSide;
    private static Office instance;
    private Door leftDoor;
    private Door rightDoor;
    private CameraController cameraController = CameraController.getInstance();
    public static Office getInstance() {
        if (instance == null) {
            instance = new Office();
        }
        return instance;
    }
    private Office(){
    leftDoor = new Door(Side.Left);
    rightDoor = new Door(Side.Right);
    }
    private void setAnimatronicDoorSide(Camera room, Side side){
        room.getAnimatronics().forEach(animatronic->{
          if(side.equals(Side.Left)){
              leftSide.add(animatronic);
          }else{
              rightSide.add(animatronic);
          }
        });
    }
    public void sideSelect(){
      cameraController.getCameras().forEach(room->{
          if(room.getRoom().equals(Room.CAM13)){
              setAnimatronicDoorSide(room, Side.Left);
          }

          if(room.getRoom().equals(Room.CAM14)){
              setAnimatronicDoorSide(room, Side.Right);
          }
      });

    }
    private void cleanUp(Side side){
        if (side==null){
            leftSide.clear();
            rightSide.clear();
        }
        if (side.equals(Side.Left)) {
            leftSide.clear();
        }
        if (side.equals(Side.Right)) {
            rightSide.clear();
        }
    }
}
