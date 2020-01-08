package com.example.demojava8.designmethod.command;

/**
 * @ClassName: Command
 * @Description: 命令类抽象对象
 * @Author: GaoYueBin
 * @Date: 2019-12-13 17:18
 * @Version 1.0
 **/
public abstract class Command {
    protected ReceiverInterface receiver;

    public Command(ReceiverInterface receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
