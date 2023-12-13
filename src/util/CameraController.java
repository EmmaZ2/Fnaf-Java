package util;

import domain.Camera;

import java.util.ArrayList;
//Singleton


public class CameraController{
    private static CameraController instance;
    private ArrayList<Camera> cameras= new ArrayList<>();

    private CameraController(){
        setUp();
    }
    public static CameraController getInstance(){
        if (instance==null){
            instance=new CameraController();
        }
        return instance;
    }

    protected void setUp(){
        cameras.add(new Camera(Room.CAM1));
        cameras.add(new Camera(Room.CAM2));
        cameras.add(new Camera(Room.CAM3));
        cameras.add(new Camera(Room.CAM4));
        cameras.add(new Camera(Room.CAM5));
        cameras.add(new Camera(Room.CAM6));
        cameras.add(new Camera(Room.CAM7));
        cameras.add(new Camera(Room.CAM8));
        cameras.add(new Camera(Room.CAM9));
        cameras.add(new Camera(Room.CAM10));
        cameras.add(new Camera(Room.CAM11));
        cameras.add(new Camera(Room.CAM12));
        cameras.add(new Camera(Room.CAM13));
        cameras.add(new Camera(Room.CAM14));
    }

    public ArrayList<Camera> getCameras() {
        return this.cameras;
    }

}