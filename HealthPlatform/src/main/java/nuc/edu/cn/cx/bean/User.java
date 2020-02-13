package nuc.edu.cn.cx.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
	private Integer id;
	private String nickname; 
	private String password;
	private String repassword;
	private String name;
	private String email;
	private String sex;
	
	@Min(value = 20,message = "年龄必须大于20岁")
	@Max(value = 60,message = "年龄必须小于60岁")
	private Integer age;
	private String tel;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String nickname, String password, String repassword, String name, String email, String sex,
			Integer age, String tel) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.password = password;
		this.repassword = repassword;
		this.name = name;
		this.email = email;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
	}
	
	public User(String nickname, String password, String repassword, String name, String email, String sex,
			Integer age, String tel) {
		super();
		this.nickname = nickname;
		this.password = password;
		this.repassword = repassword;
		this.name = name;
		this.email = email;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
	}
	
	public Integer getId() {
		return id;
	}
	public String getNickname() {
		return nickname;
	}
	public String getPassword() {
		return password;
	}
	public String getRepassword() {
		return repassword;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getSex() {
		return sex;
	}
	public Integer getAge() {
		return age;
	}
	public String getTel() {
		return tel;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nickname=" + nickname + ", password=" + password + ", repassword=" + repassword
				+ ", name=" + name + ", email=" + email + ", sex=" + sex + ", age=" + age + ", tel=" + tel + "]";
	}
	
	
}
