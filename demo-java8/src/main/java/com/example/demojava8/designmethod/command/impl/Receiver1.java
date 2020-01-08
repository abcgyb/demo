package com.example.demojava8.designmethod.command.impl;

import com.example.demojava8.designmethod.command.ReceiverInterface;

/**
 * @ClassName: Receiver1
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:18
 * @Version 1.0
 **/
public class Receiver1 implements ReceiverInterface {
    @Override
    public void receive() {
        System.out.println("接受者1接收消息！");
    }
}
