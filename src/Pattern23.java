public class Pattern23 {
    public static void main(String[] args) {
        int n=4;
        for(int r=0;r<=n;r++){
            for(int c=0;c<=n;c++){
                  int index=Math.min(Math.min(r,c),Math.min(n-r,n-c));
                System.out.print(index);
            }
            System.out.println();
        }
    }
}
/*

00000
01110
01210
01110
00000

 */