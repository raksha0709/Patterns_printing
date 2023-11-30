public class Pattern13 {
    public static void main(String[] args) {
        int n=4;
        int tsp=2*(n-1);
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++) {
                System.out.print(c);
            }

            for(int s=1;s<=tsp;s++){
                System.out.print(" ");
            }
            for(int c=r;c>=1;c--){
                System.out.print(c);
            }
            System.out.println();
            tsp-=2;
            }

        }
    }
/*

1      1
12    21
123  321
12344321

 */
