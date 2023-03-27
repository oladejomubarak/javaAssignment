package dataStructure;

import java.util.Objects;

public class Vector implements List{
    private boolean isEmpty = true;
    private int count;
    private boolean contains;
    private String[] items = new String[5];
    @Override
    public boolean isEmpty(){return isEmpty;}
    @Override
    public void add(String item){
        isEmpty = false;
        items[count] = item;
        count++;
    }
    public void add(int id, String item){
        isEmpty = false;
        int temp = 0;
        String tempStr = "";
        for (int i = 0; i < items.length; i++){
            if (id == i){
                temp = i;
                tempStr = items[i];
                items[i] = item;
                items[temp + 1] = tempStr;
            }
        }
        count++;
    }
    @Override
    public int size(){
        return count;
    }
    @Override
    public String get(int id){
        return items[id];
    }
    @Override
    public void remove(int id){
        items[id] = null;
        count--;
    }
    @Override
    public void set(int id, String item){
        items[id] = item;
    }
    @Override
    public void remove(String item){
        for (int arrayItem = 0; arrayItem < items.length; arrayItem++){
            if (Objects.equals(items[arrayItem], item)){
                items[arrayItem] = null;
            }
        }
        count--;
    }
    @Override
    public boolean contains(String item){
        for (String s : items) {
            if (Objects.equals(s, item)) {
                contains = true;
                break;
            }
        }
        return contains;
    }
    @Override
    public void clear(){
        for (int item = 0; item < items.length; item++){
            items[item] = null;
        }
        count = 0;
        isEmpty = true;
    }

}
