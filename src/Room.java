public class Room {
    private boolean isInThere = false;
    private String name;
    public Room(String name) {
        setName(name);
    }
    private void setName(String name) {
        assert name != null: "name cannot be null";
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // public toString()
    public String toString() {
        return getName();
    }

}
