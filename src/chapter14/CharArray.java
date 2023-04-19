package chapter14;

public class CharArray {
    public static void main(String[] args) {
        String word = "mubarak";
        char[] characters = word.toCharArray();

        for (Character character: characters
             ) {
            System.out.print(character);

        }
    }
}
