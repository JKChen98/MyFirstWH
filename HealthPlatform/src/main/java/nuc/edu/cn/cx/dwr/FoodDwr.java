package nuc.edu.cn.cx.dwr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import nuc.edu.cn.cx.service.FoodService;
import nuc.edu.cn.cx.vo.Meal;

public class FoodDwr {
	
	@Autowired
	private FoodService foodService;
	private Meal meal;
	
	public Double heatCalculate(Map formMap) {
		double result = 0;
		try {
			//BeanUtils.populate(meal, formMap);
			int sex = meal.getSex();
			int age = meal.getAgegroup();
			double weight = meal.getWeight();
			if (0 == sex) {
				switch (age) {
				case 1:
					result = 14.6 * weight + 450;
					break;
				case 2:
					result = 8.6 * weight + 830;
					break;
				case 3:
					result = 10.4 * weight + 600;
					break;
				}
			}
			if (1 == sex) {
				switch (age) {
				case 1:
					result = 15.2 * weight + 680;
					break;
				case 2:
					result = 11.5 * weight + 830;
					break;
				case 3:
					result = 13.4 * weight + 490;
					break;
				}
			}
			double coefficient = meal.getCoefficient();
			result = coefficient * result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List showFoods() {
		List list = new ArrayList();
		try {
			for(int i=0;i<7;i++){
				list.add(foodService.find());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
