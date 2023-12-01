public class Pattern17 {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
/*

A
B B
C C C
D D D D
E E E E E

 */