package nuc.edu.cn.cx.service;

import nuc.edu.cn.cx.bean.User;

public interface UserService {
	void addUser(User user);
	
	void deleteUser(Integer id);
	
	void modifyUser(User user);
	
	User selectUser(User user);
}
