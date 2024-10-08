import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

class Teque {

    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Liste l1 = new Liste();


      int N = Integer.parseInt(br.readLine());
      for (int i=0; i<N; i++) {
        String[] line = br.readLine().split(" ");
        String cmd = line[0];
        int x = Integer.parseInt(line[1]);
        if (cmd.equals("push_back")) {
          l1.pushBack(x);

        }
        else if (cmd.equals("push_front")) {
          l1.pushFront(x);

        }

        else if (cmd.equals("push_middle")) {
          l1.pushMiddle(x);

        }

        else if (cmd.equals("get")) {
         l1.get(x);

        }
      }

    }





    static class Liste {
    protected ArrayList<Integer> a1 = new ArrayList<Integer>();


    public void pushBack(int x) {
      a1.add(x);
    }

    public void pushFront(int x) {
      a1.add(0,x);
    }

    public void pushMiddle(int x) {
      int y = (a1.size()+1)/2;
      a1.add(y,x);
    }

    public void get(int x) {
      System.out.println(a1.get(x));
    }



  }
}
