public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int r=1;r<=2*n; r++){
            int totalcolsinrow= r>n ? 2*n-r:r;
            int noofspaces=n-totalcolsinrow;
            for(int s=1;s<=noofspaces;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=totalcolsinrow;c++){
                System.out.print("* ");
            }
            System.out.println();
        }/*

         *
        * *
       * * *
        * *
         *

         */
    }
}
