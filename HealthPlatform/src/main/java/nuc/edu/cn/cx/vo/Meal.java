package nuc.edu.cn.cx.vo;

public class Meal {
	private Integer sex;
	private Integer agegroup;
	private Double weight;
	private Double coefficient;
	
	public Meal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Meal(Integer sex, Integer agegroup, Double weight, Double coefficient) {
		super();
		this.sex = sex;
		this.agegroup = agegroup;
		this.weight = weight;
		this.coefficient = coefficient;
	}

	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAgegroup() {
		return agegroup;
	}
	public void setAgegroup(Integer agegroup) {
		this.agegroup = agegroup;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Double coefficient) {
		this.coefficient = coefficient;
	}
	@Override
	public String toString() {
		return "Meal [sex=" + sex + ", agegroup=" + agegroup + ", weight=" + weight + ", coefficient=" + coefficient
				+ "]";
	}
	
}
