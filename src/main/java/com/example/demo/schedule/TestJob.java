package com.example.demo.schedule;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName: TestJob
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-27 17:41
 * @Version 1.0
 **/
@Component
//@Slf4j
public class TestJob {

    private static final Logger log = LoggerFactory.getLogger(TestJob.class);

    @Scheduled(cron = "*/5 * * * * ?")
    public void test(){
        log.info("测试日志");
        System.out.println("测试定时器！");
    }
}
