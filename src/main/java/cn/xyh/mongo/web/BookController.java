package cn.xyh.mongo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xyh.mongo.pojo.form.BookForm;
import cn.xyh.mongo.service.BookService;
import cn.xyh.mongo.web.base.BaseController;

@RestController
@RequestMapping("book")
public class BookController extends BaseController{
	@Autowired
	BookService bookService;
	@PostMapping
	public ResponseEntity add(@RequestBody BookForm bookForm){
		return response(bookService.add(bookForm));
	}
}	
