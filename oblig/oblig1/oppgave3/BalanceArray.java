import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BalanceArray {
   static int max;

  public static void funk(int[] array,int v,int h) {

    if (!(v>h)) {

      int midten = (v+h)/2;

      System.out.println(array[midten]);


      funk(array,midten+1,h);
      funk(array,v,midten-1);



    }
  }
  public static void main(String[] args) {

    


    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[] sortedArray = in.lines().mapToInt(i -> Integer.parseInt(i)).toArray();


    max = sortedArray.length-1;
    BalanceArray b = new BalanceArray();
    b.funk(sortedArray,0,max);






  }






}
