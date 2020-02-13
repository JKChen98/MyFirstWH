package nuc.edu.cn.cx.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.edu.cn.cx.bean.Food;
import nuc.edu.cn.cx.dao.FoodDao;
import nuc.edu.cn.cx.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{
	
	@Autowired
	private FoodDao foodDao;
	private Food f;
	
	//一天的食物列表
	public List<Food> find() throws Exception {
		List<Food> list_day=new ArrayList<Food>();
		List<Food> list_type=new ArrayList<Food>();
		
		for(int type=1;type<=12;type++){
			list_type=foodDao.findFoodByType(type);
			Random random=new Random();
			int i=random.nextInt(list_type.size());
			f=list_type.get(i);
			list_day.add(f);
		}
		return list_day;
	}

	public List<Food> findAll() throws Exception {
		
		return foodDao.findFood();
	}

	public Food findById(Integer id) throws Exception {
		
		return foodDao.findFoodById(id);
	}

}
