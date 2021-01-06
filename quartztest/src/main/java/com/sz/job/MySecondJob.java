package com.sz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * Job 也可以继承抽象类 QuartzJobBean，若继承自 QuartzJobBean，
 * 则需要实现该类中的 executelnternal 方法，该方法在任务被调用时使用
 */
public class MySecondJob extends QuartzJobBean {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("hello:"+name+":"+new Date());
    }
}
