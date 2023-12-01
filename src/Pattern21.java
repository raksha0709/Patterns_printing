public class Pattern21 {
    public static void main(String[] args) {
        int n=5;
        int space=2*n-2;
        for(int r=1;r<=2*n-1;r++){
            int star=r;
            if(r>n) star=2*n-r;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(r<n) space-=2;
            else space+=2;
            System.out.println();
        }
    }
}
/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 */