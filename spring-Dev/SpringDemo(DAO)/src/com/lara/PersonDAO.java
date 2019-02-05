package com.lara;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;//to interact with the person table..we wl use personDAO
public class PersonDAO 
{
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	public void setUp()
	{
		String sql = "CREATE TABLE PERSONSPR(fname VARCHAR2(90),lname VARCHAR2(90),"+ "	AGE NUMBER, WEIGHT NUMBER)";
		template.execute(sql);
	}
	public void save(String fname, String lname, int age, double weight)
	{
		String sql = "INSERT INTO PERSONSPR VALUES('" + fname + "','" + lname + "'," + age + "," + weight + ")";
		template.update(sql);
	}
	public void update(String fname, String lname, int age, double weight)
	{
		String sql = "UPDATE PERSONSPR SET lname = '"+lname+ "',AGE = " + age + ",WEIGHT = " + weight+ ""+ "WHERE fname='" +fname + "'";		
		template.update(sql);
	}
	public List<Person> readAllPerson()
	{
		List<Person> person = null;
		class PersonRowmapper implements RowMapper<Person> // Using Inner Class
		{
				@Override
				public Person mapRow(ResultSet arg0, int arg1) throws SQLException 
				{
					Person p1 = new Person();
					p1.setFname(arg0.getString("fname"));
					p1.setLname(arg0.getString("lname"));
					p1.setAge(arg0.getInt("age"));
					p1.setWeight(arg0.getDouble("weight"));
					return p1;
				}
		}
		String sql = "Select * from PersonSpr";
		return person = template.query(sql,new PersonRowmapper()); 
			
	}
}
