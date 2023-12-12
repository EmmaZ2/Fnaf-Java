import domain.Animatronic;
import implement.*;
import util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        CameraController.getInstance();
        Office.getInstance();

        Animatronic freddy = new Freddy(0);
        Animatronic bonnie = new Bonnie(0);
        Animatronic chica = new Chica(0);
        Animatronic foxy = new Foxy(0);
        Animatronic goldenFreddy = new GoldenFreddy(0);
        float a= 0.1F;
        if(a==0.1){
            System.out.print("yes");
        }else{
            System.out.print("No");
        }


      //  System.out.println(Freddy.getName());

    }
}