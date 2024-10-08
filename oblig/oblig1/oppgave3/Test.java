class Test {

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

    int[] sorted = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};

    max = sorted.length-1;
    funk(sorted,0,max);






  }

}


//int midten = (int) Math.ceil((v+h)/2); //ekstra sjekker

/* if (v==midten || h==midten) {

  if (midten==0) {
    System.out.println(array[midten]);

  }
  if (midten==max-1) {
    System.out.println(array[midten+1]);

  }
  return;


} */
