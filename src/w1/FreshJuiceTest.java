package w1;
class FreshJuice1 {
	   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	   FreshJuiceSize size;
}	

public class FreshJuiceTest {

   public static void main(String args[]) {
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
      System.out.println("Size: " + juice.size);
   }
}