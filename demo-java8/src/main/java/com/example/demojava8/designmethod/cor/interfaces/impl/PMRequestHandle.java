package com.example.demojava8.designmethod.cor.interfaces.impl;

import com.example.demojava8.designmethod.cor.interfaces.BaseRequest;
import com.example.demojava8.designmethod.cor.interfaces.RequestHandle;
import com.example.demojava8.designmethod.cor.interfaces.request.AddMoneyRequest;

/**
 * @ClassName: PMRequestHandle
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-13 15:45
 * @Version 1.0
 **/
public class PMRequestHandle implements RequestHandle {

    RequestHandle rh;

    public PMRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(BaseRequest request) {
        if (request instanceof AddMoneyRequest) {
            System.out.println("要加薪, 项目经理审批!");
        } else {
            rh.handleRequest(request);
        }
        System.out.println("请求完毕");
    }
}
