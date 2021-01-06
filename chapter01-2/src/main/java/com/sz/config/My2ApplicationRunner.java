package com.sz.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@Order(4)
public class My2ApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("nonOptionArgs2====="+nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for (String optionName:optionNames) {
            System.out.println("optionName2====="+optionName+",optionValue2===="+args.getOptionValues(optionName));
        }
    }
}
