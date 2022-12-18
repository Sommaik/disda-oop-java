package th.go.dsd.util;

public class OuterClass {
    public int x = 10;

    public String getInfo() {
        return "value = " + x;
    }

    public class InnerClass {
        public int y = 5;

        public String getInfo() {
            return "value = " + x + y;
        }
    }
}
