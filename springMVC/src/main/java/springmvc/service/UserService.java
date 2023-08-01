package springmvc.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.UserData;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public int createUser(UserData user) {
		
		
		
		System.out.println("user service working");
		return this.userDao.seveUser(user);
				
	}
}
