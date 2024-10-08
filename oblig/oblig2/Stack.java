class Stack<T> {

  private T[] s;

  private int last;

  private int max;


  public Stack(int size) {

    s =   (T[]) new Object[size];
    max = size;
    last = -1;



  }

  public void push(T x) {
    if (getSize()==max-1) {
      System.out.println("Stack full");
      return;
    }

    s[++last] = x;
  }


  public T pop() {
    if (getSize()==0) {
      System.out.println("Stack empty");
      System.out.println("hei");
      return null;
    }

    return s[last--];
  }

  public int getSize() {
    int teller =0;
    for (int i =0;i<s.length;i++) {
      if (s[i]!=null) {
        teller++;
      }
    }

    return teller;
  }

  public Boolean isEmpty() {
    return last ==-1;
  }


  public void printStack() {
    for (int i = 0; i <= last; i++) {
      System.out.print(s[i] + ", ");
    }
  }



}
