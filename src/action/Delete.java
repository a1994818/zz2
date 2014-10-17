package action;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.DbCtrl;
public class Delete {
	private String title;
	private Connection con;
	private Statement st;
	private DbCtrl dbCtrl;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String delete(){
		dbCtrl=new DbCtrl();
		con=dbCtrl.getConnection();
		try{
			String sql="delete  from book where Title="+"'"+title+"'";
			st =(Statement)con.createStatement();
			st.executeUpdate(sql);
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return "SUCCESS";
	}
}
