package th.go.dsd.util;

public abstract class Vehicle implements AppRunner {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut Tuut !!");
    }

    abstract public String getInfo();

    abstract public String sayHi();

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();
        switch (param.getSubCommand()) {
            case "info":
                resp.setValue(getInfo());
                break;
        }
        return resp;
    }
}
