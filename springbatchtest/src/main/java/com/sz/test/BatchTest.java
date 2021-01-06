package com.sz.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BatchTest {
    @Autowired
    JobLauncher jobLauncher;
    @Autowired
    Job job;

    @Test
    public void test(){
        try{
            JobParameters jobParameters = new JobParameters();
            jobLauncher.run(job,jobParameters);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
