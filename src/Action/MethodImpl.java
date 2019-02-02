package Action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Beans.RegisterBean;
import Connection.MyCon;

public class MethodImpl {

	private String query;
	private int i;
	private ResultSet rs;
	Connection con = new MyCon().config();
	PreparedStatement ps; 
	public int insertRecord(RegisterBean rb, Connection con) {
		query = "insert into account values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try 
		{
			ps = con.prepareStatement(query);
			ps.setInt(1, rb.getSid());
			ps.setString(2, rb.getSname());
			ps.setInt(3, rb.getStd());
			ps.setInt(4, rb.getSesn());
			ps.setString(5, rb.getEml());
			ps.setString(6, rb.getDob());
			ps.setInt(7, rb.getPhn());
			ps.setString(8, rb.getFaname());
			ps.setString(9, rb.getMname());
			ps.setInt(10, rb.getEmcl());
			ps.setString(11, rb.getLad());
			ps.setString(12, rb.getFad());
			
			i = ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return i;
	}
	public ResultSet selectAll(Connection con)
	{
		query="select * from attendence";
		try {
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public ResultSet selectOne(Connection con, int sid) {
		
		query= "select * from attendence where sid=?";
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1, sid);
			rs=ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	
	public int deleteRecord(Connection con,int sid) {
		query= "delete from attendence where sid=?";
		
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1, sid);
			i=ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return i;
	}
	public int updateRecord(RegisterBean rb,Connection con) {
	
	query="update account set sname=?,std=?,sesn=?,eml=?,dob=?,phn=?,faname=?,mname=?,emcl=?,lad=?,fad=?,where sid=?";
	try {
		ps=con.prepareStatement(query);
		ps.setInt(1, rb.getSid());
		ps.setString(2, rb.getSname());
		ps.setInt(3, rb.getStd());
		ps.setInt(4, rb.getSesn());
		ps.setString(5, rb.getEml());
		ps.setString(6, rb.getDob());
		ps.setInt(7, rb.getPhn());
		ps.setString(8, rb.getFaname());
		ps.setString(9, rb.getMname());
		ps.setInt(10, rb.getEmcl());
		ps.setString(11, rb.getLad());
		ps.setString(12, rb.getFad());
		ps.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return i;
	}

}
