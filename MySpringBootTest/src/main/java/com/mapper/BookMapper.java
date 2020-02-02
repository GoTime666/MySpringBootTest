package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bean.Book;

@Mapper
public interface BookMapper {
	@Select("select * from tb_book")
	public List<Book> queryAllBook();
}
