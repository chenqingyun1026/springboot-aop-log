package cn.cqy.springaopdemo.dao;

import cn.cqy.springaopdemo.pojo.Book;

public interface BookMapper {

    Book findById(Integer id);
}
