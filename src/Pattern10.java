public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        printpat1(n);
        printpat2(n);

    }
    static void printpat1(int n){
        for(int r=1;r<=n;r++){
            for(int s=1;s<n-r;s++){
                System.out.print(" ");
            }
            for(int c=r;c>=1;c--){
                System.out.print("*");
            }
            for(int c=2;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void printpat2(int n){
        for(int r=n;r>=1;r--){
            int sp=n-r;
            for(int s=1;s<=sp;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*r-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}