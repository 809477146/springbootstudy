package com.sz.devtoolsandunittesting.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sz.devtoolsandunittesting.controller.HelloController;
import com.sz.devtoolsandunittesting.entity.Book;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
    @Autowired
    HelloController helloController;
    @Autowired
    WebApplicationContext wac; //注入一个WebApplicationContext来模拟ServletContext环境
    MockMvc mockMvc; //声明一个MockMvc对象，并在每个测试方法执行前进行MockMvc的初始化操作 即Before注解的内容
    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void test1() throws Exception {
        /*调用 MockMvc中的perform方法开启一个RequestBuilder请求，
        具体的请求则通过MockMvcRequestBuilders进行构建，
        调用MockMvcRequestBuilders中的 get方法表示发起一个GET请求，
        调用post方法则发起一个POST请求，其他的DELETE和PUT请求也是一样
        的，最后通过调用param方法设直请求参数。*/
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/hello")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("name","Michael"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print()) //添加返回值的验证规则，利用MockMvcResultMatchers进行验证，这里表示验证响应码是否为200 .
                .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void test2() throws  Exception {
        ObjectMapper om = new ObjectMapper();
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setId(1);
        String s = om.writeValueAsString(book);//将一个 book 对象转为一段 JSON
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                    .post("/book")
                    .contentType(MediaType.APPLICATION_JSON)//设置请求的 contentType 为 APPLICATION_JSON
                    .content(s))//设置 content 为上传的 JSON
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }
}
