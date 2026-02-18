class Room{
    public void roomAvailable(){
        System.out.println("Room is available");
    }
}
class Hotel{
    private Room room; // Here room is Room class Variable

    public Hotel(){
        room = new Room();  // Hotel class creates an object of Room class
        //Hotel is dependent on rooms.
    }
    public void showHotel(){
        System.out.println("Hotel Having :");
        room.roomAvailable();
    }
}
public class COMPOSITION {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.showHotel(); // Accessing the method of Room class through Hotel class
    }
}
