package tdd;

import diary.Diary;
import diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    Diary diary;

    @BeforeEach
    void setUp() {

        diary = new Diary();
    }

    @Test
    void testThatDiaryExits() {
        assertNotNull(diary);
    }

    @Test
    void writeAnEssay() {
        assertNotNull(diary);

    }

    @Test
    void testThatDiaryIsEmpty() {
        assertEquals(0, diary.countEntry());
    }

    @Test
    void testThatDiaryCanWriteAndSaveEntries() {
        diary.write("Best Food", "My best food is beans");
        assertEquals(1, diary.countEntry());
    }

    @Test
    void thatDiaryCanFindEntry() {
        diary.write("Best Food", "My best food is beans");
        Entry result = diary.findEntryById("1");
        assertNotNull(result);
        assertEquals("Best Food", result.getTitle());
    }

    @Test
    void testThatDiaryCanFindEntryByTitle() {
        diary.write("Best Colour", "My best colour is red");
        Entry give = diary.findEntryByTitle("Best Colour");
        assertNotNull(give);
        assertEquals("Best Colour", give.getTitle());

    }
    @Test
    void testThatDiaryCanWriteMultipleTimes(){
        diary.write("Best Colour", "My best colour is red");
        diary.write("Best Food", "My best colour is beans");
        diary.write("Best game", "My best colour is Pes");
        assertEquals(3, diary.countEntry());

    }
    @Test
    void testThatDiaryCanDelete(){
        diary.write("Best Colour", "My best colour is red");
        diary.write("Best Food", "My best colour is beans");
        diary.write("Best game", "My best colour is Pes");
        diary.deleteEntryById("2");
        assertEquals(2, diary.countEntry());
    }
    @Test
    void testThatDiaryCanViewEntry(){
        diary.write("Best Colour", "My best colour is red");
        diary.write("Best Food", "My best colour is beans");
        diary.write("Best game", "My best colour is Pes");
        diary.viewEntryById("2");
        assertEquals("idForThisEntryIs2\n" +
                " Title isBest Food\n" +
                " Body is My best colour is beans.", diary.viewEntryById("2"));

    }
    @Test
    void testThatEntryTitleCanBeEdited(){
        Entry written = diary.write("Best Colour", "My best colour is red");
        assertEquals(1, diary.countEntry());
        assertEquals("Best Colour", written.getTitle());
        diary.editTitle("1", "Favourite Colour");
        assertEquals("Favourite Colour", written.getTitle());

    }
    @Test
    void testThatEntryTitleCanOnlyBeEditedWithValidId(){
        diary.write("Best Colour", "My best colour is red");
        diary.write("Up nepa", "light dey");
        assertEquals(2,diary.countEntry());
        assertEquals("Entry does not exist", diary.editTitle("3","Favourite food"));
    }
    @Test
    void testThatDiaryCanDeleteAllEntries(){
        diary.write("Best Colour", "My best colour is red");
        diary.write("Up Nepa", "light dey");
        diary.write("My complexion", "I am black");
        assertEquals(3,diary.countEntry());
        diary.deleteAllEntries();
        assertEquals(0, diary.countEntry());
    }
}