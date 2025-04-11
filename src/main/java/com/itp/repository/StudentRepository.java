package com.itp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.itp.model.Student;

@Component
public class StudentRepository {

	public void addStudent(Student s1) throws Exception
	{
		Connection con=MySQLConnectionITP.getConnection();
		String query="insert into student values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, s1.getRno());
		ps.setString(2, s1.getSname());
		ps.setDouble(3, s1.getPer());
		
		int rows=ps.executeUpdate();					
		
		ps.close();
		con.close();	
	}

	public List<Student> studentList() 
	{
		List<Student> students=new ArrayList();   //empty ArrayList
		try
		{
		Connection con=MySQLConnectionITP.getConnection();
		
		
		String query="select * from Student";
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
			
		while(rs.next())			//from the resultset populate the ArrayList
		{
			Student s1=new Student(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			students.add(s1);
		}
			
		
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			
		}
		
		return students;
	}

}
