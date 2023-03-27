package chapter8.hugeInteger;

public class HugeInteger {
   private int[] integerArray;
   //private int length = 40;
   public HugeInteger(int[] integerArray){
       if(integerArray.length != 40){
           throw new HugeIntegerException("The size should be 40");
       }
       else {
       this.integerArray = integerArray;}
   }
}
