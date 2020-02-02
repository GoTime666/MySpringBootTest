package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Book;
import com.mapper.BookMapper;

@Controller
public class MapperController {
	
	@Autowired
	private BookMapper bookMapper;
	
	@RequestMapping("/queryBook")
	@ResponseBody
	public List<Book> queryBook(){
		List<Book> books=bookMapper.queryAllBook();
		return books;
	}
	
}
