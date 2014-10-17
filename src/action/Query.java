package action;

import info.AuthorInfo;
import info.BookInfo;
import java.util.ArrayList;
import java.util.List;

public class Query {
	private String author;
	private String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private QueryAuthor que=new QueryAuthor();
	private List<AuthorInfo> list=new ArrayList<AuthorInfo>();
	private List<BookInfo> bookList=new ArrayList<BookInfo>();
	private BookInfo book=new BookInfo();
	
	
	public List<BookInfo> getBookList() {
		return bookList;
	}
	public void setBookList(List<BookInfo> bookList) {
		this.bookList = bookList;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	public List<AuthorInfo> getList() {
		return list;
	}
	public void setList(List<AuthorInfo> list) {
		this.list = list;
	}
	
	public String queAuthor(){
		String name=que.getAuthorID(author);
		this.setBookList(que.getBookIDInfo(name));
		if(!bookList.isEmpty()){
			return "SUCCESS";
		}
		else{
			return "ERROR";
		}
	}
	
	public String queAuthor2(){
		String name=que.getAuthorName(title);
		this.setList(que.getAuthorInfo(name));
		this.setBookList(que.getBookInfo(name,title));                       
		if(!list.isEmpty()){
			return "SUCCESS";
		}
		else{
			return "ERROR";
		}
	}
	public BookInfo getBook() {
		return book;
	}
	public void setBook(BookInfo book) {
		this.book = book;
	}
	
	
}
