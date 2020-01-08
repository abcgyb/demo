package com.example.demojava8.designmethod.command.impl;

import com.example.demojava8.designmethod.command.ReceiverInterface;

/**
 * @ClassName: Receiver
 * @Description: 命令接受者
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:05
 * @Version 1.0
 **/
public class Receiver implements ReceiverInterface {

    @Override
    public void receive() {
        System.out.println("接受者0接收消息！");
    }
}
