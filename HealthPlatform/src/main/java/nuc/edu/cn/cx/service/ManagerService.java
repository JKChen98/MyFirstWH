package nuc.edu.cn.cx.service;

import nuc.edu.cn.cx.bean.Manager;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: ManagerService.java </p> 
 * @author chenx
 * @date 2020年2月10日
 * @description 
 */
public interface ManagerService {
	/**
	 * @title：addManager
	 * @description : 添加管理员
	 * @param manager
	 * @CreateDate 2020年2月10日 下午4:14:13
	 */
	void addManager(Manager manager);
	
	/**
	 * @title：deleteManager
	 * @description : 删除管理员
	 * @param id
	 * @CreateDate 2020年2月10日 下午4:14:16
	 */
	void deleteManager(Integer id);
	
	/**
	 * @title：modifyManager
	 * @description :
	 * @param manager 管理员修改密码
	 * @CreateDate 2020年2月10日 下午4:14:19
	 */
	void modifyManager(Manager manager);
	
	/**
	 * @title：selectManager
	 * @description :
	 * @param manager 管理员登录
	 * @return
	 * @CreateDate 2020年2月10日 下午4:14:21
	 */
	Manager selectManager(Manager manager);
}
