package com.sz.dao;

import com.sz.entity.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "book_cache") //指明使用的缓存的名字（可选） 也可在@Cacheable注解中指明缓存名字
public class BookDao {

//    @Cacheable(cacheNames = "book_cache")
    /*
        表明对该方法进行缓存，默认情况下，缓存的key是方法的参数，缓存的value是方法的返回值。
        当开发者在其他类中调用该方法时，首先会根据调用参数查看缓存中是否有相关数据，
        若有，则直接使用缓存数据，该方法不会执行，否则执行该方法，执行成功后将返回值缓存起来，
        但若是在当前类中调用该方法，则缓存不会生效。
     */
    /*
        @Cacheable 注解中还有一个属性 condition 用来描述缓存的执行时机，
        例如 @Cacheable(condition = "#id%2==0")表示当 id 对 2 取模为 0 时才进行缓存，否则不缓存．
    */
    /*
        也可用用@Cacheable(key = "#book.id")来自定义key  示例key为book对象中id的值
     */
    /*
        Spring提供了一个root对象来生成key
        属性名称         属性描述               用法示例
        methodName      当前方法名              #root.methodName
        method          当前方法对象            #root.method.name
        caches          当前方法使用的缓存       #root.caches[0].name
        target          当前被调用的对象         #root.target
        targetClass     当前被调用的对象的class  #root.targetClass
        args            当前方法参数数组        #root.args[0]

        如果这些key不能够满足开发需求，可自定义缓存key的生成器KeyGenerator
        使用方式：注入自己定义的KeyGenerator
        @Cacheable(keyGenerator="myKeyGenerator")
     */
//    @Cacheable
    @Cacheable(keyGenerator="myKeyGenerator")
    public Book getBookById(Integer id){
        System.out.println("getBookById");
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setId(id);
        return book;
    }

    /*
        ＠CachePut 注解一般用于数据更新方法上，与＠Cacheable 注解不同，
        添加了 @CachePut 注解的方法每次在执行时都不去检查缓存中是否有数据，而是直接执行方法，
        然后将方法的执行结果缓存起来，如果该 key 对应的数据已经被缓存起来了，
        就会覆盖之前的 数据，这样可以避免再次加载数据时获取到脏数据。
        同时，＠CachePut 具有和＠Cacheable 类似的属性
    */
    @CachePut(key = "#book.id")
    public Book updateBookById(Book book){
        System.out.println("updateBookById");
        book.setName("三国演义2");
        return book;
    }

    /*
    ＠CacheEvict 注解一般用于删除方法上，表示移除一个 key对应的缓存。
    ＠CacheEvict 注解有两个特殊的属性： allEntries 和 beforelnvocation，
    其中 allEntries 表示是否将所有的缓存款据都移除，默认为false，
    beforelnvocation 表示是否在方法执行之前移除缓存中的数据，默认为 false，即在方法执行之后移除缓存中的敖据。
     */
    @CacheEvict(key = "#id")
    public void deleteBookById(Integer id){
        System.out.println("deleteBookById");
    }
}
