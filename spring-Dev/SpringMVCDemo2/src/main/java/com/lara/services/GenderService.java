package com.lara.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lara.dao.GenderDAO;
import com.lara.entity.Gender;
public class GenderService {
	private GenderDAO genderDao;
	@Autowired
	public void setGenderDAO(GenderDAO genderDao) {
		this.genderDao = genderDao;
	}
	
	public List<Gender> allGenders()
	{
		return genderDao.allGenders();
	}

}
