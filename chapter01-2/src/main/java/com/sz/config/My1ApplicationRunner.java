package com.sz.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@Order(3)
public class My1ApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("nonOptionArgs1====="+nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for (String optionName:optionNames) {
            System.out.println("optionName1====="+optionName+",optionValue1===="+args.getOptionValues(optionName));
        }
    }
}
