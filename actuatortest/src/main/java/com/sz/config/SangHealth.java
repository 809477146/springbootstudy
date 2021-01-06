package com.sz.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 开发者自定义类实现HealthIndicator接口，并实现该接口中的health方法。在health方法中，
 * checkNetwork是一个网络连接检查的方法，Health中的up和down方法分别对应两种常见的响应状态，即“up”和“down”。
 *
 * 默认的响应状态一共有4种，定义在OrderedHealthAggregator类中，分别是DOWN、OUT_OF_SERVICE、UP、UNKNOWN，
 * 如果开发者想增加响应状态，可以自定义类继承自HealthAggregator，或者在application.properties中
 * 通过management.health.status.order 属性进行配置。
 */
@Component
public class SangHealth implements HealthIndicator {
    @Override
    public Health health() {
        /*if (checkNetwork()){
            return Health.up().withDetail("msg","网络连接正常。。。").build();
        }
        return Health.down().withDetail("msg","网络断开...").build();*/
        return Health.status("FATAL").withDetail("msg","网络断开...").build();
    }

    public boolean checkNetwork(){
        return true;
    }
}
