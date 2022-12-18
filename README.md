# disda-oop-java

## compile command

```
javac th/go/dsd/app/Application.java
```

## run command

```
java th.go.dsd.app.Application
```

```
public abstract class AppRunner {
    abstract public CallResponse runCommand(CallParam param);
}

class CallResponse {
    String value;
}

class CallParam {
    String command;
    String subCommand;
    String[] list;
}
```
