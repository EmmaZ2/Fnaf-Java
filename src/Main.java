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


<<<<<<< HEAD


=======
          System.out.println(Freddy.getName());
>>>>>>> 1df289caafada3a9396fe4b54e63c1b5d8d2fc9e

    }
}
