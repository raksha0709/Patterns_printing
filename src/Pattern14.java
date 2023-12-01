public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        int p=1;
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
}
/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */