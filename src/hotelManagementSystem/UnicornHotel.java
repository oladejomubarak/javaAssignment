package hotelManagementSystem;

public class UnicornHotel {
    private static String [] rooms;

    public UnicornHotel(int numberOfRooms){
        rooms= new String[numberOfRooms];
    }

    public static boolean checkOut(int roomNumber) {
            boolean result = false;
            rooms[roomNumber -1] = null;
            if (rooms[roomNumber] == null){
                result = true;
            }
            return result;
    }


    public String bookRoom(String name) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = name;
                break;
            }

        }
        return "Rooms booked successfully!";

    }

    public String getRoomGuest(int roomNumber) {
        return rooms[roomNumber - 1];
    }

    public String[] getRooms() {
        return rooms;
    }


}
