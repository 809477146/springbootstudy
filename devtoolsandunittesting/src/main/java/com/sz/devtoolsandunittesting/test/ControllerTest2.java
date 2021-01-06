package com.sz.devtoolsandunittesting.test;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.sz.devtoolsandunittesting.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ControllerTest2 {
    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void test3(){
        ResponseEntity<String> hello = restTemplate.getForEntity("/hello?name={0}", String.class, "Michael");
        System.out.println(hello.getBody());
    }

    @Test
    public void test4() throws Exception {
        JsonMapper mapper = new JsonMapper();
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setId(1);
        ResponseEntity<String> response = restTemplate.postForEntity("/book", book, String.class);
        System.out.println(response.getBody());

    }

}
