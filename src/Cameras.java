import java.util.ArrayList;
public class Cameras {
    Room actualRoom= new Room("1a");
    private ArrayList<Room> rooms = new ArrayList<>();
    public Cameras(){
        setCamera();
        setActualRoom(rooms.get(0));
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    private void setCamera(){
        //create rooms
        Room r1a= new Room("1a");
        Room r1b= new Room("1b");
        Room r1c= new Room("1c");
        Room r2a= new Room("2a");
        Room r2b= new Room("2b");
        Room r3= new Room("3");
        Room r4a= new Room("4a");
        Room r4b= new Room("4b");
        Room r5= new Room("5");
        Room r6= new Room("6");
        Room r7= new Room("7");
        Room ryou= new Room("you");
        //add rooms to ArrayList
        rooms.add(r1a);
        rooms.add(r1b);
        rooms.add(r1c);
        rooms.add(r2a);
        rooms.add(r2b);
        rooms.add(r3);
        rooms.add(r4a);
        rooms.add(r4b);
        rooms.add(r5);
        rooms.add(r6);
        rooms.add(r7);
        rooms.add(ryou);
    }
    public Room getActualRoom() {
        return actualRoom;
    }
    private void setActualRoom(Room actualRoom) {
        assert actualRoom!= null: "Room cannot";
        this.actualRoom = actualRoom;
    }
    public void changeRoom(String roomName) {
        assert roomName!= null: "Room cannot be null";
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getName().equals(roomName)) {
                setActualRoom(rooms.get(i));
            }else{
                System.out.println("doesn't exist");
            }
        }
        System.out.println(Cameras.this.toString());
    }
    //toString()
    @Override
    public String toString() {
        return rooms.toString();
    }
}
