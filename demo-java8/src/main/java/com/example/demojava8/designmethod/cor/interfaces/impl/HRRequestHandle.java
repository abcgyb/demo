package com.example.demojava8.designmethod.cor.interfaces.impl;

import com.example.demojava8.designmethod.cor.interfaces.BaseRequest;
import com.example.demojava8.designmethod.cor.interfaces.RequestHandle;
import com.example.demojava8.designmethod.cor.interfaces.request.DimissionRequest;

/**
 * @ClassName: HRRequestHandle
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-13 15:36
 * @Version 1.0
 **/
public class HRRequestHandle implements RequestHandle {

    @Override
    public void handleRequest(BaseRequest request) {
        if (request instanceof DimissionRequest) {
            System.out.println("要离职, 人事审批!");
        }
        System.out.println("请求完毕");
    }
}
