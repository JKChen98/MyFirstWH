package nuc.edu.cn.cx.service;

import java.util.List;

import nuc.edu.cn.cx.bean.Food;

public interface FoodService {
	/**
	 * 一天的食物列表
	 */
	public List<Food> find() throws Exception;
	/**
	 * 所有的食物列表
	 */
	public List<Food> findAll()throws Exception;
	/**
	 * 根据id查找食物
	 */
	public Food findById(Integer id)throws Exception;
}
