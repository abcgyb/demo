package com.example.demojava8.designmethod.facade.interfaces.impl;

import com.example.demojava8.designmethod.facade.interfaces.ServiceC;

/**
 * @ClassName: ServiceCImpl
 * @Description: 服务C接口实现类
 * @Author: GaoYueBin
 * @Date: 2019-12-10 14:41
 * @Version 1.0
 **/
public class ServiceCImpl implements ServiceC {
    @Override
    public void methodC() {
        System.out.println("服务C执行!");
    }
}
