public class Pattern16 {
    public static void main(String[] args) {
        int n=5;
        for(int r=n;r>=1;r--){
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

A B C D E
A B C D
A B C
A B
A

 */