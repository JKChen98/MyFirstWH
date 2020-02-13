package nuc.edu.cn.cx.bean;

public class Food {
	private Integer id;  //食物id
	private String name;  //食物名字
	private Integer type;  //食物类型
	private Double protein; //蛋白质
	private Double carbohydrate; //碳水化合物
	private Double fat;   //脂肪
	private Double fiber;   //纤维素
	private Double heat;    //热量
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(Integer id, String name, Integer type, Double protein, Double carbohydrate, Double fat, Double fiber,
			Double heat) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.fat = fat;
		this.fiber = fiber;
		this.heat = heat;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getType() {
		return type;
	}
	public Double getProtein() {
		return protein;
	}
	public Double getCarbohydrate() {
		return carbohydrate;
	}
	public Double getFat() {
		return fat;
	}
	public Double getFiber() {
		return fiber;
	}
	public Double getHeat() {
		return heat;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public void setProtein(Double protein) {
		this.protein = protein;
	}
	public void setCarbohydrate(Double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	public void setFat(Double fat) {
		this.fat = fat;
	}
	public void setFiber(Double fiber) {
		this.fiber = fiber;
	}
	public void setHeat(Double heat) {
		this.heat = heat;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", type=" + type + ", protein=" + protein + ", carbohydrate="
				+ carbohydrate + ", fat=" + fat + ", fiber=" + fiber + ", heat=" + heat + "]";
	}
	
	
}
