import java.sql.SQLOutput;

public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int r=1;r<=5;r++) {
            for(int s=1;s<=n-r;s++){
                System.out.print(" ");
            }
            for(int c=r;c>=1;c--){
                System.out.print(c);
            }
            for(int c=2;c<=r;c++){
                System.out.print(c);
            }
            System.out.println();
        }
/*

    1
   212
  32123
 4321234
543212345

 */
    }
}
