public class Pattern19 {
    public static void main(String[] args) {
        int  n=5;
        for(int i=0;i<n;i++){

            char ch = (char)((int)('A'+n-1));

            for(int j=0;j<=i;j++)
            {
                System.out.print((ch--) + " ");
            }

            System.out.println();
        }
    }
}
/*

E
E D
E D C
E D C B
E D C B A

 */
