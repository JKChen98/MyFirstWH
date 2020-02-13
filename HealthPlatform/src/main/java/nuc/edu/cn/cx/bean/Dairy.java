package nuc.edu.cn.cx.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * <p>
 * 项目名称: HealthPlatform
 * </p>
 * <p>
 * 文件名称: Dairy.java
 * </p>
 * 
 * @author chenx
 * @date 2020年1月7日
 * @description 健康日记表
 */
public class Dairy {
	/**
	 * @description 添加日期
	 */
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date_add;

	/**
	 * @description 添加文字
	 */
	private String text;

	/**
	 * @description 睡眠时间
	 */

	private Double sleeptime;

	/**
	 * @description 心情
	 */
	private String mood;

	/**
	 * @description 体重
	 */
	private Double weight;

	/**
	 * @description 压力
	 */
	private String pressure;

	/**
	 * @description 高血压
	 */
	private Double BpHigh;

	/**
	 * @description 低血压
	 */
	private Double BpLow;

	/**
	 * @description 血糖
	 */
	private Double Glu;

	/**
	 * @description 血脂
	 */
	private Double Bf;

	/**
	 * @description 心率
	 */
	private Double heart;

	/**
	 * @description 老师的用户id
	 */
	private User user;

	public Dairy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dairy(Date date_add, String text, Double sleeptime, String mood, Double weight, String pressure,
			Double bpHigh, Double bpLow, Double glu, Double bf, Double heart, User user) {
		super();
		this.date_add = date_add;
		this.text = text;
		this.sleeptime = sleeptime;
		this.mood = mood;
		this.weight = weight;
		this.pressure = pressure;
		BpHigh = bpHigh;
		BpLow = bpLow;
		Glu = glu;
		Bf = bf;
		this.heart = heart;
		this.user = user;
	}

	public Date getDate_add() {
		return date_add;
	}

	public String getText() {
		return text;
	}

	public Double getSleeptime() {
		return sleeptime;
	}

	public String getMood() {
		return mood;
	}

	public Double getWeight() {
		return weight;
	}

	public String getPressure() {
		return pressure;
	}

	public Double getBpHigh() {
		return BpHigh;
	}

	public Double getBpLow() {
		return BpLow;
	}

	public Double getGlu() {
		return Glu;
	}

	public Double getBf() {
		return Bf;
	}

	public Double getHeart() {
		return heart;
	}

	public User getUser() {
		return user;
	}
	
	public void setDate_add(Date date_add) {
		this.date_add = date_add;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setSleeptime(Double sleeptime) {
		this.sleeptime = sleeptime;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public void setBpHigh(Double bpHigh) {
		BpHigh = bpHigh;
	}

	public void setBpLow(Double bpLow) {
		BpLow = bpLow;
	}

	public void setGlu(Double glu) {
		Glu = glu;
	}

	public void setBf(Double bf) {
		Bf = bf;
	}

	public void setHeart(Double heart) {
		this.heart = heart;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Dairy [date_add=" + date_add + ", text=" + text + ", sleeptime=" + sleeptime + ", mood=" + mood
				+ ", weight=" + weight + ", pressure=" + pressure + ", BpHigh=" + BpHigh + ", BpLow=" + BpLow + ", Glu="
				+ Glu + ", Bf=" + Bf + ", heart=" + heart + ", user=" + user + "]";
	}

}