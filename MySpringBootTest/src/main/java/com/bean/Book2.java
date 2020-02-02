package com.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Book2 implements Serializable {
	/**
	 * 
	 * @author GoTime
	 * @since 2020-2-1
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", publisher=" + publisher + ", picture=" + picture
				+ ", price=" + price + ", publishTime=" + publishTime + ", author=" + author + ", amount=" + amount
				+ "]";
	}

	private Integer bookId;
	private String bookName;
	private String publisher;
	private String picture;
	private Double price;
	private Date publishTime;
	private String author;
	private Integer amount;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public static void main(String[] args) {
		Date date1 = new Date();
		Timestamp sqlDate = new Timestamp(date1.getTime());
		System.out.println(sqlDate + "\n" + date1);
	}
}
