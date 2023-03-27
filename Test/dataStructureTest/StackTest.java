package dataStructureTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    dataStructure.Stack stackElement;
    @BeforeEach
    public void setUp(){
        stackElement = new dataStructure.Stack();
    }
    @Test
    public void testThatStackIsEmpty(){
        assertTrue(stackElement.isEmpty());
    }
    @Test
    public void pushItem_stackIsNotEmpty(){
        stackElement.push("Dog");
        stackElement.push("Horse");
        stackElement.push("Cat");
        assertFalse(stackElement.isEmpty());
    }
    @Test
    public void pushItemToStack_SizeIsOne(){
        stackElement.push("Cat");
        int size = stackElement.size();
        assertEquals(1, size);
    }
    @Test
    public void pushItemToStack_getByIndex(){
        stackElement.push("Cat");
        String itemAtIndex = stackElement.get(0);
        assertEquals("Cat", itemAtIndex);
    }
    @Test
    public void pushItemABCtoStack_getItemsABC(){
        stackElement.push("Dog");
        stackElement.push("Horse");
        stackElement.push("Cat");
        assertEquals("Dog", stackElement.get(0));
        assertEquals("Horse", stackElement.get(1));
        assertEquals("Cat", stackElement.get(2));
    }
    @Test
    public void pushABC_replaceA(){
        stackElement.push("Dog");
        stackElement.push("Horse");
        stackElement.push("Cat");
        stackElement.set(0, "Lion");
        assertEquals("Lion", stackElement.get(0));
    }
    @Test
    public void pushXYZtoStack_lastItemIsRemoved(){
        stackElement.push("Dog");
        stackElement.push("Horse");
        stackElement.push("Cat");
        stackElement.pop();
        assertEquals("Cat", stackElement.pop());
    }
    @Test
    public void pushABCtoStack_getC(){
        stackElement.push("Dog");
        stackElement.push("Horse");
        stackElement.push("Cat");
        stackElement.peek();
        assertEquals("Cat", stackElement.peek());
    }
    @Test
    public void testThatStackPositionCanBeReturned(){
        stackElement.push("Dog");
        stackElement.push("Horse");
        stackElement.push("Cat");
        assertEquals(3, stackElement.search("Dog"));
    }

}
