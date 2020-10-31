package cn.cqy.springaopdemo.dao;


import cn.cqy.springaopdemo.SpringaopdemoApplicationTests;
import cn.cqy.springaopdemo.pojo.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookMapperTest extends SpringaopdemoApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void findById() {
        Book book = bookMapper.findById(1);
        System.out.println(book);
    }
}