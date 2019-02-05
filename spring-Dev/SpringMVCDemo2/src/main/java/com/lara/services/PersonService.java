package com.lara.services;
import org.springframework.beans.factory.annotation.Autowired;
import com.lara.dao.PersonDAO;
import com.lara.entity.Person;
public class PersonService 
{
	private PersonDAO personDao;
	
	@Autowired
	public void setPersonDAO(PersonDAO personDao)
	{
		this.personDao = personDao;
	}
	public void save(Person p1)
	{
		personDao.save(p1);
	}
}
