public class Pattern18 {
    public static void main(String[] args) {
        int n=5;
        for(int r=0;r<n;r++) {
             for(int c=1;c<=n-r-1;c++) {
                 System.out.print(" ");
             }
                 char ch = 'A';
                 int breakpoint = (2*r+1)/2;
                 for(int j=1;j<=2*r+1;j++){

                     System.out.print(ch);
                     if(j <= breakpoint) ch++;
                     else ch--;

             }
            System.out.println();
        }
    }
}
/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

 */