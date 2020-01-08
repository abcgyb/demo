package com.example.demojava8.designmethod.command;

/**
 * @ClassName: Invoker
 * @Description: 客户端方法
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:10
 * @Version 1.0
 **/
public class Client {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
