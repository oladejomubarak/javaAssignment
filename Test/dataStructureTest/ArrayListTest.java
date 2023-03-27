package dataStructureTest;

import dataStructure.ArrayList;
import dataStructure.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List list;
    @BeforeEach
    void testThatListExists(){
        list = new ArrayList();
    }

    @Test
    public void newListIsEmpty(){
       // List list = new ArrayList();
        assertTrue(list.isEmpty());
    }
    @Test
    public void addItemListIsNotEmptyTest(){
        // List list = new ArrayList();
        list.add("G-string");
        assertFalse(list.isEmpty());
    }
    @Test
    public void addItemListIsNotEmpty_ItemIsOne(){
       //  List list = new ArrayList();
        list.add("G-string");
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());

    }
    @Test
    public void addItemGetItemByIndexTest(){
        // List list = new ArrayList();
        list.add("A-String");
        String savedItem = list.get(0);
        assertEquals("A-String", savedItem);
    }
    @Test
    void addXYGetXYTest() {
        // List list = new ArrayList();
        list.add("G-String");
        list.add("A-String");
        assertEquals("G-String", list.get(0));
        assertEquals("A-String", list.get(1));
    }
    @Test
    void addXyRemoveYSizeIsOneTest() {
        // List list = new ArrayList();
        list.add("G-String");
        list.add("A-String");
        list.remove(1);
        assertEquals(1, list.size());
    }

    @Test
    void addXyRemoveYFindByIndexIsNullTest() {
        // List list = new ArrayList();
        list.add("G-String");
        list.add("A-String");
        list.remove(1);
        assertEquals(1, list.size());
        String deletedItem = list.get(1);
        assertNull(deletedItem);
    }

}