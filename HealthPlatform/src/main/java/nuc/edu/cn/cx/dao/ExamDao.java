package nuc.edu.cn.cx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import nuc.edu.cn.cx.bean.Exam;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: ExamDao.java </p> 
 * @author chenx
 * @date 2020年2月5日
 * @description 体检记录映射接口
 */
public interface ExamDao {
	
	/**
	 * @title：addExam
	 * @description : 管理员添加教师的体检记录
	 * @param exam
	 * @CreateDate 2020年2月5日 下午5:56:16
	 */
	void addExam(Exam exam);
	
	/**
	 * @title：findExam  
	 * @description : 教师可以查看自己的体检记录
	 * @param id
	 * @return
	 * @CreateDate 2020年2月5日 下午5:56:57
	 */
	List<Exam> findExam(int id);
	
	/**
	 * @title：findSomeRecords
	 * @description : 教师可以查看自己体检部分项目的变化
	 * @param id
	 * @return
	 * @CreateDate 2020年2月8日 下午5:29:23
	 */
	List<Exam> findSomeRecords(int id);
}
