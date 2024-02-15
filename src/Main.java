import domain.Animatronic;
import implement.*;
import util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        CameraController.getInstance();
        Office.getInstance();

        Animatronic freddy = new Freddy(20);
        Animatronic bonnie = new Bonnie(0);
        Animatronic chica = new Chica(0);
        Animatronic foxy = new Foxy(0);
        Animatronic goldenFreddy = new GoldenFreddy(0);
        Player.getInstance();

    }
}
