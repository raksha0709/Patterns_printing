public class Pattern15 {
    public static void main(String[] args) {
        int n=5;

        for(int r=1;r<=n;r++){
            char ch='A';
           for(int c=1;c<=r;c++){
               System.out.print(ch+" ");
               ch++;
           }
            System.out.println();
        }
    }
}
/*

A
A B
A B C
A B C D
A B C D E

 */
