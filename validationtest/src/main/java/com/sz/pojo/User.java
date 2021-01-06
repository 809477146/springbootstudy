package com.sz.pojo;

import com.sz.validation.ValidationGroup1;
import com.sz.validation.ValidationGroup2;

import javax.validation.constraints.*;

/**
 * @Size 表示一个字符串的长度或者一个集合的大小，必须在某一个范围中；min参数表示范围的下限；
 * max参数表示范围的上限； message 表示校验失败时的提示信息。
 *
 * @NotNull 注解表示该字段不能为空。
 *
 * @DecimalMin 注解表示对应属性值的下限，＠DecimalMax注解表示对应属性值的上限。
 *
 * @Email 注解表示对应属性格式是一个 Email
 */

/**
 * 校验注解 	注解的元素类型 	描述
 * AssertFalse 	Boolean、boolean 	被注解的元素值必须为false
 * AssertTrue 	Boolean、boolean 	被注解的元素值必须为 true
 * DecimalMax 	BigDecimal、BigInteger、CharSequence、byte、short、int、long以及它们各自的包装类 	被注解的元素值小于等于＠DecimalMax注解中的value值
 * DecimalMin 	BigDecimal、BigInteger、CharSequence、byte、short、int、long以及它们各自的包装类 	被注解的元素值大于等于＠DecimalMin注解中的value值
 * Max 	BigDecimal、BigInteger、byte、short、int、long以及它们各自的包装类 	被注解的元素值小于等于＠Max注解中的value值
 * Min 	BigDecimal、BigInteger、byte、short、int、long以及它们各自的包装类 	被注解的元素值大于等于＠Min注解中的value值
 * Digits 	BigDecimal、Biglnteger、CharSequence、byte、short、int、long以及它们各自的包装类 	被注解的元素必须是一个数字，其值必须在可接受的范围内(整数位数和小数位数在指定范围内)
 * Email 	CharSequence 	被注解的元素值必须是Email格式
 * Future 	java.util.Date、java.util.Calendar以及java.time包下的时间类 	被注解的元素值必须是一个未来的日期
 * Past 	java.util.Date、java.util.Calendar以及java.time包下的时间类 	被注解的元素值必须是一个过去的日期
 * PastOrPresent 	java.util.Date、java.util.Calendar以及java.time包下的时间类 	被注解的元素值必须是一个过去的日期或者当前日期
 * FutureOrPresent  	java.util.Date、java.util.Calendar以及java.time包下的时间类 	被注解的元素值必须是一个未来的日期或当前日期
 * Negative 	BigDecimal、BigInteger、byte、short、int、long以及它们各自的包装类 	被注解的元素必须是负数
 * NegativeOrZero 	BigDecimal、BigInteger、byte、short、int、long以及它们各自的包装类 	被注解的元素必须是负数或0
 * Positive 	BigDecimal、BigInteger、byte、short、int、long以及它们各自的包装类 	被注解的元素必须是正数
 * PositiveOrZero  	BigDecimal、BigInteger、byte、short、int、long以及它们各自的包装类 	被注解的元素必须是正数或O
 * NotBlank 	CharSequence 	被注解的元素必须不为null并且至少有一个非空白的字符
 * NotEmpty 	CharSequence、Collection、Map、Array 	被注解的字符串不为null或空字符串，被注解的集合或数组不为空。和@NotBlank注解相比，一个空格字符串在＠NotBlank验证不通过，但是在@NotEmpty中验证通过
 * NotNull 	任意类型 	被注解的元素不为null
 * Null 	任意类型 	被注解的元素为null
 * Pattern 	CharSequence 	被注解的元素必须符合指定的正则表达式
 * Size 	CharSequence、Collection、Map、Array 	被注解的字符串长度、集合或者数组的大小必须在指定范围内
 */
public class User {
    private Integer id;
    @Size(min = 5,max = 10,message = "{user.name.size}",groups = ValidationGroup1.class)
    private String name;
    @NotNull(message = "{user.address.notnull}",groups = ValidationGroup2.class)
    private String address;
    @DecimalMin(value = "1",message = "{user.age.size}")
    @DecimalMax(value = "200",message = "{user.age.size}")
    private Integer age;
    @Email(message = "{user.email.pattern}")
    @NotNull(message = "{user.email.notnull}",groups = {ValidationGroup1.class,ValidationGroup2.class})
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
