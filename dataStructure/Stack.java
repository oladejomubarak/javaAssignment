package dataStructure;

import java.util.Objects;

public class Stack extends Vector{
    private final String[] stackObject = new String[3];
    private int count;
    private boolean isEmpty = true;

    @Override
    public boolean isEmpty(){
        return isEmpty;
    }
    public void push(String item){
        stackObject[count] = item;
        isEmpty = false;
        count++;
    }
    @Override
    public int size(){
        return count;
    }
    @Override
    public String get(int id){
        return stackObject[id];
    }
    @Override
    public void set(int id, String item){
        stackObject[id] = item;
    }
    public String pop(){
        count--;
        return stackObject[stackObject.length - 1];
    }
    public String peek(){
        return stackObject[stackObject.length - 1];
    }
    public int search(String element){
        for (int elementNumber = 0; elementNumber < stackObject.length; elementNumber++){
            if (Objects.equals(stackObject[elementNumber], element)){
                return stackObject.length - elementNumber;
            }
        }
        return -1;
    }

}
