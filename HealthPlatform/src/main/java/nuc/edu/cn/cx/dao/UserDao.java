package nuc.edu.cn.cx.dao;

import nuc.edu.cn.cx.bean.User;

public interface UserDao {
	void addUser(User user);
	
	void deleteUser(Integer id);
	
	void modifyUser(User user);
	
	User selectUser(User user);
}
