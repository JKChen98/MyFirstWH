package nuc.edu.cn.cx.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import nuc.edu.cn.cx.bean.Dairy;
import nuc.edu.cn.cx.bean.User;
import nuc.edu.cn.cx.dao.DairyDao;
import nuc.edu.cn.cx.service.DairyService;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: DairyServiceImpl.java </p> 
 * @author chenx
 * @date 2020年1月7日
 * @description 
 */

@Service
public class DairyServiceImpl implements DairyService{
	
	@Autowired
	private DairyDao dairyDao;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void addDairy(Dairy dairy) {
		dairyDao.addDairy(dairy);
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public Dairy findDairy(Date date_add, User user) {
		// TODO Auto-generated method stub
		return dairyDao.findDairy(date_add, user);
	}

}
