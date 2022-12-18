package th.go.dsd.util;

public class Echo implements AppRunner {
    public String say(String name) {
        return "Hello " + name;
    }

    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();
        if (param.getOptions() != null) {
            switch (param.getSubCommand()) {
                case "say":
                    String msg = "";
                    for (String o : param.getOptions()) {
                        msg += "You say ".concat(o).concat("\n");
                    }
                    resp.setValue(msg);
                    break;
            }
        }
        return resp;
    }
}
