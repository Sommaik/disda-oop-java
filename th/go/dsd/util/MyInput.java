package th.go.dsd.util;

import java.util.Scanner;

public class MyInput implements AppRunner {
    private String name;
    private int age;
    private String info;

    public MyInput() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();
        switch (param.getSubCommand()) {
            case "info":
                Scanner sc = new Scanner(System.in);
                System.out.print("Please input your name: ");
                name = sc.nextLine();

                System.out.print("Please input your age: ");
                age = sc.nextInt();

                // String[] opts = param.getOptions();
                // setWords(opts[0]);
                resp.setValue("You name: " + name + " . You are " + age + " years-old.");
                sc.close();
                break;
            default:
                System.out.println("Not Support!");
                break;
        }
        return resp;
    }

    // @Override
    // public CallResponse runCommand(CallParam param) {
    // CallResponse resp = new CallResponse();
    // switch (param.getSubCommand()) {
    // case "info":
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Your name: ");
    // this.setName(sc.nextLine());
    // System.out.println("age: ");
    // this.setAge(sc.nextInt());
    // setInfo("Hello " + this.getName() + ", age =" + this.getAge());
    // resp.setValue(getInfo());
    // sc.close();
    // break;
    // default:
    // System.out.println("Not Support!");
    // break;
    // }
    // return resp;
    // }

}

// public class MyInput implements AppRunner {

// // @Override
// // public CallResponse runCommand(CallParam param) {
// // CallResponse re = new CallResponse();
// // switch (param.getSubCommand()) {
// // case "info":
// // Scanner sc = new Scanner(System.in);
// // System.out.println("Your name: ");
// // String name = sc.nextLine();
// // System.out.println("Age: ");
// // int age = sc.nextInt();
// // String respText = "Hello " + name + ", age =" + age;
// // re.setValue(respText);
// // sc.close();
// // break;
// // }
// // return re;
// // }

// // public CallResponse runCommand(CallParam param) {
// // CallResponse resp = new CallResponse();
// // switch (param.getSubCommand()) {
// // case "info":

// // Scanner sc = new Scanner(System.in);
// // System.out.print("Please inpu name");
// // String name = sc.nextLine();

// // System.out.print("Please input age.");
// // int age = sc.nextInt();
// // sc.close();
// // resp.setValue("Your name is " + name + " age = " + age);

// // break;
// // case "":
// // resp.setValue("Who are u");
// // break;
// // default:
// // resp.setValue("Who are u");
// // break;
// // }
// // return resp;
// // }

// }
// javac th/go/dsd/util/MyInput.java
// java th.go.dsd.util.MyInput

// Case 1
// java th.go.dsd.app.Application myinput info
// output :
// Your Name:
// Age :
// Hello -- , age = xx