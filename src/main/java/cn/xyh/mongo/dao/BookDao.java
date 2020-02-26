package cn.xyh.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.xyh.mongo.entity.Book;

public interface BookDao extends MongoRepository<Book, String>{
	
}
