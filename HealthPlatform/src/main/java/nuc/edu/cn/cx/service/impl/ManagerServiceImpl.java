package nuc.edu.cn.cx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import nuc.edu.cn.cx.bean.Manager;
import nuc.edu.cn.cx.dao.ManagerDao;
import nuc.edu.cn.cx.service.ManagerService;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: ManagerServiceImpl.java </p> 
 * @author chenx
 * @date 2020年2月10日
 * @description 
 */

@Service
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private ManagerDao managerDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void addManager(Manager manager) {
		managerDao.addManager(manager);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteManager(Integer id) {
		managerDao.deleteManager(id); 
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void modifyManager(Manager manager) {
		managerDao.modifyManager(manager);
		
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public Manager selectManager(Manager manager) {
		 
		return managerDao.selectManager(manager);
	}

}
