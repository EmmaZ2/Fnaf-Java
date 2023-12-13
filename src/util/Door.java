package util;

public class Door {
    private boolean open=false;
    private boolean light=false;
    private Side side;
    protected Door(Side side){
        setSide(side);
    }
    protected void setSide(Side side) {
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
    public void lightSwitch(){
        light = !light;
    }
    public void checkAnimatronic() {
        Office.getInstance().sideSelect();

    }
    protected Side getSide() {
        return side;
    }
}
