package chapter8.time1.usingKeyReference;

public class ThisTest {

    public static void main(String[] args) {
     SimpleTime time = new SimpleTime(14, 30, 54);
        System.out.print(time.buildString());
    }
}
    class SimpleTime {
        private int hour;
        private int minute;
        private int second;

        public SimpleTime(int hour, int minute, int second){
        this.hour= hour;
        this.minute= minute;
        this.second= second;
        }
        public String toUniversalString(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
        }
        public String buildString(){
        return String.format("%s: %s%n%s: %s", "This.toUniversalString", this.toUniversalString(),
                "ToUniversalString", toUniversalString());
        }
}

