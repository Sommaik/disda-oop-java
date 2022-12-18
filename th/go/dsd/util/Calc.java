package th.go.dsd.util;

import java.util.ArrayList;

public class Calc extends AppRunner {
    public int add(int a, int b) {
        return a + b;
    }

    public int sum(ArrayList<Integer> x) {
        int sum = 0;
        for (int i = 0; i < x.size(); i++) {
            sum += x.get(i);
        }
        return sum;
    }

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();
        switch (param.getSubCommand()) {
            case "add":
                if (param.getOptions() != null) {
                    String[] opts = param.getOptions();
                    int len = opts.length;
                    int a = len > 0 ? Integer.parseInt(opts[0]) : 0;
                    int b = len > 1 ? Integer.parseInt(opts[1]) : 0;
                    int c = add(a, b);
                    resp.setValue("Value  = " + c);
                }
                break;
            case "sum":
                resp.setValue("Not implement");
                break;
            default:
                break;
        }
        return resp;
    }
}
