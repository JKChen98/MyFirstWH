package nuc.edu.cn.cx.dao;


import java.util.Date;

import org.apache.ibatis.annotations.Param;

import nuc.edu.cn.cx.bean.Dairy;
import nuc.edu.cn.cx.bean.User;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: DairyDao.java </p> 
 * @author chenx
 * @date 2020年1月7日 
 */
public interface DairyDao {
	/**
	 * 
	 * @title：addDairy
	 * @description : 教师记录自己的健康日记
	 * @param dairy
	 * @return: void
	 * @CreateDate 2020年1月7日 上午11:14:57
	 */
	void addDairy(Dairy dairy);
	
	/**
	 * 
	 * @title：findDairy
	 * @description : 教师可以查询每天的健康日记
	 * @param date
	 * @return
	 * @CreateDate 2020年1月8日 上午10:01:03
	 */
	Dairy findDairy(@Param("date_add") Date date_add,@Param("user") User user);
}
