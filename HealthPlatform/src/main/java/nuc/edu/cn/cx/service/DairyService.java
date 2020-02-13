package nuc.edu.cn.cx.service;

import java.util.Date;

import nuc.edu.cn.cx.bean.Dairy;
import nuc.edu.cn.cx.bean.User;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: DairyService.java </p> 
 * @author chenx
 * @date 2020年1月7日
 * @description 
 */
public interface DairyService {
		
	/**
	 * 
	 * @title：addDairy
	 * @description : 教师记录自己的健康日记
	 * @param dairy
	 * @return: void
	 * @CreateDate 2020年1月7日 上午11:26:38
	 */
	void addDairy(Dairy dairy);
	
	/**
	 * 
	 * @title：findDairy
	 * @description : 教师可以查询每天的健康日记
	 * @param date
	 * @return
	 * @CreateDate 2020年1月8日 上午10:02:43
	 */
	Dairy findDairy(Date date_add,User user);
}
