package th.go.dsd.util;

public class MyStringFunction {
    public static void main(String[] args) {
        StringFunction s1 = (s) -> s + "!";
        StringFunction s2 = (s) -> "Test " + s + " .....";
        printFormatted("Hello", s1);
        printFormatted("Hi", s2);
        AppRunner r = (param) -> new CallResponse();
        testRun(r);
    }

    public static void printFormatted(String str, StringFunction fnc) {
        String rest = fnc.run(str);
        System.out.println(rest);
    }

    public static void testRun(AppRunner runner) {
        String[] param = { "" };
        runner.runCommand(new CallParam(param));
    }
}
