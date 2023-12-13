package util;
import domain.Animatronic;

public class Door {
    private boolean open=false;
    private boolean light=false;
    private Side side;
    protected Door(Side side){
        setSide(side);
    }
    protected void setSide(Side side) {
        assert side!= null : "side can't be null";
        this.side = side;
    }
    protected void closeDoor(){
        if(open){
            open = false;
        }
    }
    protected void openDoor(){
        if(!open){
            open = true;
        }
    }
    protected void lightOn(Animatronic animatronic){
        if(!light){
            light = true;
        }
        if(animatronic!=null && animatronic.getActualRoom().equals(Room.CAM12)) {
            light=true;
            System.out.println(animatronic.getName() + " is on the Office");
        }
    }
     void lightOff(){
        if(light){
            light = false;
        }
    }
}
