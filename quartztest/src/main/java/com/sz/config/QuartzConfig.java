package com.sz.config;

import com.sz.job.MySecondJob;
import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.SimpleTrigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.*;

@Configuration
public class QuartzConfig {
    /**
     * JobDetail的配直有两种方式：
     * 第一种方式通过MethodInvokingJobDetailFactoryBean类配置JobDetail，只需要指定Job的实例名和要调用的方法即可，
     * 注册这种方式无法在创建JobDetail时传递参数；
     */
    @Bean
    MethodInvokingJobDetailFactoryBean jobDetail(){
        MethodInvokingJobDetailFactoryBean bean = new MethodInvokingJobDetailFactoryBean();
        bean.setTargetBeanName("myFirstJob");
        bean.setTargetMethod("sayHello");
        return bean;
    }

    /**
     * 第二种方式是通过JobDetailFactoryBean来实现的，这种方式只需要指定JobClass即可，
     * 然后可以通过JobDataMap传递参数到Job中，Job中只需要提供属性名，并且提供一
     * 个相应的set法即可接收到参数。
     * @return
     */
    @Bean
    JobDetailFactoryBean jobDetail2(){
        JobDetailFactoryBean bean = new JobDetailFactoryBean();
        bean.setJobClass(MySecondJob.class);
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("name","sang");
        bean.setJobDataMap(jobDataMap);
        bean.setDurability(true);
        return bean;
    }

    /**
     * Trigger有多种不同实现，这里展示两种常用的Trigger: SimpleTrigger和CronTrigger，
     * 这两种Trigger分别使用SimpleTriggerFactoryBean和CronTriggerFactoryBean进行创建。
     * 在SimpleTriggerFactoryBean对象中，首先设置JobDetail，
     * 然后通过setRepeatCount配置任务循环次数，
     * setStartDelay配置任务启动延迟时间，
     * setRepeatInterval配直任务的时间间隔。
     */
    @Bean
    SimpleTriggerFactoryBean simpleTrigger(){
        SimpleTriggerFactoryBean bean = new SimpleTriggerFactoryBean();
        bean.setJobDetail(jobDetail().getObject());
        bean.setRepeatCount(3);
        bean.setStartDelay(1000);
        bean.setRepeatInterval(2000);
        return bean;
    }

    /**
     * 在 CronTriggerFactoryBean对象中，则主要配置JobDetail和Cron表达式。
     * @return
     */
    @Bean
    CronTriggerFactoryBean cronTrigger(){
        CronTriggerFactoryBean bean = new CronTriggerFactoryBean();
        bean.setJobDetail(jobDetail2().getObject());
        bean.setCronExpression("* * * * * ?");
        return bean;
    }

    /**
     * 最后通过SchedulerFactoryBean创建SchedulerFactory，然后配置Trigger即可。
     * @return
     */
    @Bean
    SchedulerFactoryBean schedulerFactory(){
        SchedulerFactoryBean bean = new SchedulerFactoryBean();
        SimpleTrigger simpleTrigger = simpleTrigger().getObject();
        CronTrigger cronTrigger = cronTrigger().getObject();
        bean.setTriggers(simpleTrigger,cronTrigger);
        return bean;
    }
}
