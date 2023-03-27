package hotelManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnicornHotelTest {
    UnicornHotel unicornHotel;
    @BeforeEach
    void testThisBeforeAllTests(){
        unicornHotel = new UnicornHotel(5);

    }
    @Test
    void testThatHotelExist(){
        assertNotNull(unicornHotel);
    }
    @Test
    void testThatWeGatRooms_AndAreEmpty(){
        String [] rooms = unicornHotel.getRooms();
        assertNotNull(rooms);
        for (String room : rooms){
            assertNull(room);
        }
    }
    @Test
    void testThatRoomCanBeBooked(){
        String name = "segun";
        String result = unicornHotel.bookRoom(name);
        assertNotNull(result);
        assertEquals(name, unicornHotel.getRoomGuest(1));
        String name2 = "lekan";
        unicornHotel.bookRoom(name2);
        assertEquals(name2, unicornHotel.getRoomGuest(2));


    }
    @Test
    void testThatGuestCanCheckOut(){
        assertTrue(UnicornHotel.checkOut(1));
    }
}
