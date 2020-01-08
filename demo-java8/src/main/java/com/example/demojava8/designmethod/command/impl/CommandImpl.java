package com.example.demojava8.designmethod.command.impl;

import com.example.demojava8.designmethod.command.Command;
import com.example.demojava8.designmethod.command.ReceiverInterface;

/**
 * @ClassName: CommandImpl
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:09
 * @Version 1.0
 **/
public class CommandImpl extends Command {

    public CommandImpl(ReceiverInterface receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.receive();
    }
}
