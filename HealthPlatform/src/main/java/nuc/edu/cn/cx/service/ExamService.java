package nuc.edu.cn.cx.service;


import org.jfree.data.category.CategoryDataset;

import com.github.pagehelper.PageInfo;

import nuc.edu.cn.cx.bean.Exam;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: ExamService.java </p> 
 * @author chenx
 * @date 2020年2月6日
 * @description 
 */
public interface ExamService {
	
	/**
	 * @title：addExam
	 * @description : 管理员添加体检记录
	 * @param exam
	 * @CreateDate 2020年2月6日 下午1:33:48
	 */
	void addExam(Exam exam);
	
	/**
	 * @title：findExam
	 * @description : 教师查询自己的体检记录,使用pagehelper插件进行分页
	 * @param id
	 * @return
	 * @CreateDate 2020年2月6日 下午1:33:51
	 */
	PageInfo<Exam> findExam(int id,int pageNum,int pageSize);
	
	/**
	 * @title：findSomeRecords
	 * @description : 教师可以查看自己体检部分项目的变化
	 * @param id
	 * @return
	 * @CreateDate 2020年2月8日 下午5:30:18
	 */
	CategoryDataset findSomeRecords(int id);
}
