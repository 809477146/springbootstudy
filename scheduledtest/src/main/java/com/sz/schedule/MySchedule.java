package com.sz.schedule;

import com.sun.org.apache.bcel.internal.generic.DADD;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MySchedule {

    /**
     * fixedDelay = 1000表示在当前任务执行结束后1秒开启另一个任务
     */
    @Scheduled(fixedDelay = 1000)
    public void fixedDelay(){
        System.out.println("fixedDelay:"+new Date());
    }

    /**
     * fixedRate = 2000表示在当前任务开始执行2秒后开启另一个任务
     */
    @Scheduled(fixedRate = 2000)
    public void fixedRate(){
        System.out.println("fixedRate:"+new Date());
    }

    /**
     * initialDelay = 1000表示首次执行的延迟时间
     */
    @Scheduled(initialDelay = 1000,fixedRate = 2000)
    public void initialDelay(){
        System.out.println("initialDelay:"+new Date());
    }

    @Scheduled(cron = "0 * * * * ?")
    public void cron(){
        System.out.println("cron:"+new Date());
    }
}
