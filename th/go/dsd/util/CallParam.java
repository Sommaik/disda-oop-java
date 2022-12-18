package th.go.dsd.util;

public class CallParam {
    private String command;
    private String subCommand;
    private String[] options;

    public CallParam(String[] args) {
        int len = args.length;
        this.command = len > 0 ? args[0] : "Not Support";
        this.subCommand = len > 1 ? args[1] : "No Subcommand";
        if (len > 2) {
            this.options = new String[len - 2];
            System.arraycopy(args, 2, this.options, 0, len - 2);
        }
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getSubCommand() {
        return subCommand;
    }

    public void setSubCommand(String subCommand) {
        this.subCommand = subCommand;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

}
