package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class passengerTest {

    @BeforeEach
    void init()
    { }

    @Test
    void testConstructor() {
        Passenger p1 = new Passenger("MR", "Evan Carr", 1234567, 1253456, 23 );
        assertEquals("MR", p1.getTitle());
        assertEquals("Evan Carr", p1.getName());
        assertEquals(1234567, p1.getID());
        assertEquals(1253456, p1.getPhone());
        assertEquals(23, p1.getAge());
    }

    @Test
    void testName() {
        Passenger p1 = new Passenger("Mr", "", 123, 456, 23);
        p1.setName("Evan Carr");
        assertEquals("Evan Carr", p1.getName());
    }

    @Test
    void testTitle() {
        Passenger p1 = new Passenger("", "Evan", 123, 456, 23);
        p1.setTitle("Mr");
        assertEquals("Mr", p1.getTitle());
    }

    @Test
    void testID() {
        Passenger p1 = new Passenger("Mr", "Evan", 1, 456, 23);
        p1.setID(123);
        assertEquals(123, p1.getID());
    }

    @Test
    void testAge() {
        Passenger p1 = new Passenger("Mr", "Evan", 1, 456, 1);
        p1.setAge(23);
        assertEquals(23, p1.getAge());
    }

    @Test
    void testPhone() {
        Passenger p1 = new Passenger("Mr", "Evan", 1, 1, 1);
        p1.setPhone(1234567);
        assertEquals(1234567, p1.getPhone());
    }


}
