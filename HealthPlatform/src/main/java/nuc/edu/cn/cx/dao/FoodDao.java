package nuc.edu.cn.cx.dao;

import java.util.List;

import nuc.edu.cn.cx.bean.Food;

public interface FoodDao {
	public List<Food> findFoodByType(Integer type);
	
	public Food findFoodById(Integer id);
	
	public List<Food> findFood();
}
