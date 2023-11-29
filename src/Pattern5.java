public class Pattern5 {
    public static void main(String[] args) {
      int n=9;
      for(int row=1;row<=2*n;row++){
          int totalcolsinrow = row > n? 2*n-row:row;
          for(int col=1;col<=totalcolsinrow;col++){
              System.out.print("* ");
          }
          System.out.println();
      }/*

       *
       * *
       * * *
       * * * *
       * * * * *
       * * * * * *
       * * * * * * *
       * * * * * * * *
       * * * * * * * * *
       * * * * * * * *
       * * * * * * *
       * * * * * *
       * * * * *
       * * * *
       * * *
       * *
       *


       */
    }
}
