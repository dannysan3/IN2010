import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


class BalanceHeap {



    public void balanser(PriorityQueue<Integer> pq) {

      PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();

      if (pq.size()==0) {
        return;
      }


      int halv = pq.size()/2;


      for (int i=0;i<halv;i++) {
        p2.offer(pq.poll());
      }

      int midten = pq.poll();
      System.out.println(midten);

      balanser(pq);
      balanser(p2);


    }



    public static void main(String[] args) {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int[] sortedArray = in.lines().mapToInt(i -> Integer.parseInt(i)).toArray();

      PriorityQueue<Integer> p3 = new PriorityQueue<Integer>();
      for (int i=0;i<sortedArray.length;i++) {
        p3.offer(sortedArray[i]);
      }

      BalanceHeap pp = new BalanceHeap();
      pp.balanser(p3);




    }









}
