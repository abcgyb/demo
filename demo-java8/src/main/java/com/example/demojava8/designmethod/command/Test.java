package com.example.demojava8.designmethod.command;

import com.example.demojava8.designmethod.command.impl.CommandImpl;
import com.example.demojava8.designmethod.command.impl.Receiver;
import com.example.demojava8.designmethod.command.impl.Receiver1;

/**
 * @ClassName: Test
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-13 16:40
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("命令模式测试方法--------------");
        ReceiverInterface receiver = new Receiver();
        Command command = new CommandImpl(receiver);
        Client client = new Client();
        client.setCommand(command);
        client.execute();

        ReceiverInterface receiver1 = new Receiver1();
        Command command1 = new CommandImpl(receiver1);
        Client client1 = new Client();
        client1.setCommand(command1);
        client1.execute();
    }
}
