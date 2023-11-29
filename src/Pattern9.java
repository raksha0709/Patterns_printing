public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
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
