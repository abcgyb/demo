package com.example.demojava8.designmethod.cor.interfaces.impl;

import com.example.demojava8.designmethod.cor.interfaces.BaseRequest;
import com.example.demojava8.designmethod.cor.interfaces.RequestHandle;
import com.example.demojava8.designmethod.cor.interfaces.request.LeaveRequest;

/**
 * @ClassName: TLRequestHandle
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-13 15:50
 * @Version 1.0
 **/
public class TLRequestHandle implements RequestHandle {

    RequestHandle rh;

    public TLRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(BaseRequest request) {
        if (request instanceof LeaveRequest) {
            System.out.println("要请假, 项目组长审批!");
        } else {
            rh.handleRequest(request);
        }
        System.out.println("请求完毕");
    }
}
