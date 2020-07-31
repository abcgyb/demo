package com.example.cloudclient1.hystrics;

import com.example.cloudclient1.interfaces.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ClassName: SchedualServiceHiHystric
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2020-01-09 16:18
 * @Version 1.0
 **/
@Component
public class SchedualServiceHiHystric  implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "这个是熔断器的返回";
    }
}
