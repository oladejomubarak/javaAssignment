package myPractice;

import java.util.ArrayList;

public class ArrayTutorialFunmi {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String[] items = new String[5];
        items [0] = "book";
        items [1] = "pen";
        items [2] = "pencil";
        items [3] = "rice";
        items [4] = "basket";
        for (int i = 0; i < items.length; i++){
            System.out.println(items[i]);
        }
        names.add("film");
        names.add("ball");
        names.add("love");
        names.add("bed");
        names.add("spoon");
        names.remove(2);
        names.add (1,  "junno");
        for (int j = 0; j < names.size(); j++){
            System.out.println(j + 1 + " = " + names.get(j));
        }


    }
}
