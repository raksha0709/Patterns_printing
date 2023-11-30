public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        printp1(n);
        printp2(n);
    }

    static void printp1(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printp2(int n) {
        for (int r = n - 1; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
