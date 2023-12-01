public class Pattern20 {
    public static void main(String[] args) {
        int n=5;
        int insp=0;
        for(int r=0;r<n;r++){
            for(int j=1;j<=n-r;j++){
                System.out.print("*");
            }
            for(int s=0;s<insp;s++){
                System.out.print(" ");
            }

            for(int j=1;j<=n-r;j++){
                System.out.print("*");
            }
            insp+=2;
            System.out.println();
        }
        int sp=2*n-2;
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }

            for(int s=1;s<=sp;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            sp-=2;
            System.out.println();
        }


    }
}
/*

 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********

 */