package com.lzp.bean;

import org.springframework.beans.factory.FactoryBean;

public class BookFactory implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setName("java");
        book.setAuthor("lzp");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
