package com.sz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 首先通过＠EnableSwagger2注解开启Swagger2，然后最主要的是配直一 Docket。
 * 通过apis方法配直要扫描的controller位置，通过 paths方法配直路径。
 * 在apiInfo中构建文档的基本信息，例如描述、联系人信息、版本、标题等。
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sz.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder()
                .description("微人事接口测试文档")
                .contact(new Contact("江南一点雨","https://github.com/lenve","809477146@qq.com"))
                .version("v1.0")
                .title("API测试文档")
                .license("Apache2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .build());

    }
}
