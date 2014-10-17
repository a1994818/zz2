package action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import info.AuthorInfo;
import info.BookInfo;
import database.DbCtrl;
public class QueryAuthor {
	private Connection con;
	private Statement st;
	private DbCtrl dbCtrl;
	private List<AuthorInfo> authorList=new ArrayList<AuthorInfo>();
	private List<BookInfo> bookList=new ArrayList<BookInfo>();
	
	public String getAuthorName(String name){
		BookInfo man=new BookInfo();
		dbCtrl=new DbCtrl();
		con=dbCtrl.getConnection();
		try{
			String sql="select * from book where Title="+"'"+name+"'";
			st =(Statement)con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				man.setISBN(rs.getString("ISBN"));
				man.setTitle(rs.getString("Title"));
				man.setAuthorID(rs.getString("AuthorID"));
				man.setPublisher(rs.getString("Publisher"));
				man.setPublishDate(rs.getString("PublishDate"));
				man.setPrice(rs.getDouble("Price"));
				bookList.add(man);
			}
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return man.getAuthorID();
	}
	
	
	public List<BookInfo> getBookInfo(String name){
		dbCtrl=new DbCtrl();
		con=dbCtrl.getConnection();
		try{
			String sql="select * from book where Author="+"'"+name+"'";
			st =(Statement)con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				BookInfo man=new BookInfo();
				man.setISBN(rs.getString("ISBN"));
				man.setTitle(rs.getString("Title"));
				man.setAuthorID(rs.getString("AuthorID"));
				man.setPublisher(rs.getString("Publisher"));
				man.setPublishDate(rs.getString("PublishDate"));
				man.setPrice(rs.getDouble("Price"));
				bookList.add(man);
			}
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return bookList;
	}
	
	public List<BookInfo> getBookIDInfo(String name){
		dbCtrl=new DbCtrl();
		con=dbCtrl.getConnection();
		try{
			String sql="select * from book where AuthorID="+"'"+name+"'";
			st =(Statement)con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				BookInfo man=new BookInfo();
				man.setISBN(rs.getString("ISBN"));
				man.setTitle(rs.getString("Title"));
				man.setAuthorID(rs.getString("AuthorID"));
				man.setPublisher(rs.getString("Publisher"));
				man.setPublishDate(rs.getString("PublishDate"));
				man.setPrice(rs.getDouble("Price"));
				bookList.add(man);
			}
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return bookList;
	}
	
	public List<BookInfo> getBookInfo(String name1,String name2){
		dbCtrl=new DbCtrl();
		con=dbCtrl.getConnection();
		try{
			String sql="select * from book where AuthorID="+"'"+name1+"' "+"AND "+"Title="+"'"+name2+"'";
			st =(Statement)con.createStatement();
			ResultSet rs = st.executeQuery(sql);
		
				BookInfo man=new BookInfo();
				man.setISBN(rs.getString("ISBN"));
				man.setTitle(rs.getString("Title"));
				man.setAuthorID(rs.getString("AuthorID"));
				man.setPublisher(rs.getString("Publisher"));
				man.setPublishDate(rs.getString("PublishDate"));
				man.setPrice(rs.getDouble("Price"));
				bookList.add(man);
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return bookList;
	}
	
	public List<AuthorInfo> getAuthorInfo(String name){
		dbCtrl=new DbCtrl();
		con=dbCtrl.getConnection();
		try{
			String sql="select * from author where AuthorID="+"'"+name+"'";
			st =(Statement)con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				AuthorInfo man=new AuthorInfo();
				man.setAuthorID(rs.getString("AuthorID"));
				man.setName(rs.getString("Name"));
				man.setAge(rs.getInt("Age"));
				man.setCountry(rs.getString("Country"));
				authorList.add(man);
			}
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return authorList;
	}
	
	public String getAuthorID(String name){
		AuthorInfo man=new AuthorInfo();
		dbCtrl=new DbCtrl();
		con=dbCtrl.getConnection();
		try{
			String sql="select * from author where Name="+"'"+name+"'";
			st =(Statement)con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				man.setAuthorID(rs.getString("AuthorID"));
				man.setName(rs.getString("Name"));
				man.setAge(rs.getInt("Age"));
				man.setCountry(rs.getString("Country"));
				authorList.add(man);
			}
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return man.getAuthorID();
	}
	
	
	

}
