package nuc.edu.cn.cx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import nuc.edu.cn.cx.bean.User;
import nuc.edu.cn.cx.dao.UserDao;
import nuc.edu.cn.cx.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void addUser(User user) {
		user.toString();
		userDao.addUser(user);
		
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
		
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void modifyUser(User user) {
		userDao.modifyUser(user);
		
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public User selectUser(User user) {
		
		return userDao.selectUser(user);
	}

}
