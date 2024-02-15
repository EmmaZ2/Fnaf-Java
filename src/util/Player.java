package util;


import domain.Camera;

public class Player {
    private static Player instance;
    private static boolean isAlive=true;
    private Player(){

    }

    public static Player getInstance(){
        if (instance==null){
            instance=new Player();
        }
        return instance;
    }
    public void die(){
        CameraController.getInstance().getCameras().forEach(camera -> {
            if (camera.getRoom().equals(Room.CAM12)){
                camera.getAnimatronics().forEach(animatronic->{
                    if(animatronic.getActualRoom().equals(camera.getRoom()) && isAlive){
                        isAlive=false;
                        System.out.println("You Died");
                    }
                });
            }
        });
    }
    public boolean isAlive() {
        return isAlive;
    }
}
