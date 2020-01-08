package com.example.demojava8.designmethod.cor;

import com.example.demojava8.designmethod.cor.interfaces.BaseRequest;
import com.example.demojava8.designmethod.cor.interfaces.RequestHandle;
import com.example.demojava8.designmethod.cor.interfaces.impl.HRRequestHandle;
import com.example.demojava8.designmethod.cor.interfaces.impl.PMRequestHandle;
import com.example.demojava8.designmethod.cor.interfaces.impl.TLRequestHandle;
import com.example.demojava8.designmethod.cor.interfaces.request.AddMoneyRequest;
import com.example.demojava8.designmethod.cor.interfaces.request.DimissionRequest;
import com.example.demojava8.designmethod.cor.interfaces.request.LeaveRequest;

/**
 * @ClassName: Test
 * @Description: 职责链模式
 * @Author: GaoYueBin
 * @Date: 2019-12-13 15:31
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("职责链模式测试方法---------------------");
        //构建职责链
        RequestHandle hr = new HRRequestHandle();
        RequestHandle pm = new PMRequestHandle(hr);
        RequestHandle tl = new TLRequestHandle(pm);

        BaseRequest request = new LeaveRequest();
        tl.handleRequest(request);

        BaseRequest request1 = new AddMoneyRequest();
        pm.handleRequest(request1);

        BaseRequest request2 = new DimissionRequest();
        pm.handleRequest(request2);

    }
}
