package th.go.dsd.app;

public class Recursion {
    public static void main(String[] args) {
        int rest = sum(10);
        System.out.println(rest);
        int res2 = sum(5, 10);
        System.out.println(res2);
    }

    static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
