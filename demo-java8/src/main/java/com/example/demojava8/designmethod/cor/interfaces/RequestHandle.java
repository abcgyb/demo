package com.example.demojava8.designmethod.cor.interfaces;

import org.omg.CORBA.Request;

/**
 * @ClassName: RequestHandle
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-13 15:34
 * @Version 1.0
 **/
public interface RequestHandle {

    void handleRequest(BaseRequest request);

}
