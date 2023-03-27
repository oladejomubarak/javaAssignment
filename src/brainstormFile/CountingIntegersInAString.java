package brainstormFile;

import java.util.List;

public class CountingIntegersInAString {
    public static void main(String[] args) {
        List<String> strings = List.of("gdf543", "gdsytty465", "t6347375", "6774fdre");
        System.out.println(countIntegers(strings));
    }
    private static int countIntegers(List<String> list){
        int count = 0;

        for(String str : list){
            for (var i = 0; i < str.length(); i++) {
                if(Character.isDigit(str.charAt(i))) count++;
               // char character = str.charAt(i);
               // if(Character.isDigit(character)) count++;
            }
        }
        return count;
    }

}
