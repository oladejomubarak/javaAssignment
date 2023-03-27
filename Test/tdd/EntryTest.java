package tdd;

import diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    Entry entry;
    @BeforeEach
    void SetUp(){
        entry = new Entry("Mub", "Line");
    }

    @Test
    void testThatEntryExists(){
        assertNotNull(entry);
    }
    @Test
    void testThatEntryHasTitle(){
        assertEquals("Mub", entry.getTitle());
    }
    @Test
    void testThatEntryHasBodyTitle(){
        assertEquals("Line",entry.getBody());
    }
    @Test
    void testThatEntryHasTimeAndDate(){
        assertEquals("07/23/2022 08:13 pm", entry.getLocalDateTime());

}
}
