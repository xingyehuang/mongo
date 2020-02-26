package cn.xyh.mongo.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xyh.mongo.dao.BookDao;
import cn.xyh.mongo.entity.Book;
import cn.xyh.mongo.pojo.form.BookForm;
import cn.xyh.mongo.service.BookService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookServiceImpl implements BookService{
	@Autowired
	BookDao bookDao;
	@Override
	public boolean add(BookForm bookForm) {
		Book book = Book.builder().build();
		BeanUtils.copyProperties(bookForm, book);
		return bookDao.save(book) != null;
	}
	
}
