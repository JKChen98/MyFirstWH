package nuc.edu.cn.cx.bean;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: exam.java </p> 
 * @author chenx
 * @date 2020年2月5日
 * @description 体检记录表
 */
public class Exam {
	/**
	 * @description 主键id
	 */
	private Integer id;
	
	/**
	 * @description 体检时间
	 */
	private String datetime;
	
	/**
	 * @description 舒张压
	 */
	
	private Double dp;
	
	/**
	 * @description 收缩压
	 */
	
	private Double sp;
	
	/**
	 * @description 体重指数
	 */
	
	private Double bmi;
	
	/**
	 * @description 腰臀比
	 */
	
	private Double whr;
	
	/**
	 * @description 尿素
	 */
	
	private Double ua;
	
	/**
	 * @description 尿酸
	 */
	
	private Double crea;
	/**
	 * @description 肌酐
	 */
	private Double tg;
	/**
	 * @description 甘油三酯
	 */
	private Double chol;
	/**
	 * @description 胆固醇
	 */
	private Double bun;
	/**
	 * @description 高密度脂蛋白胆固醇
	 */
	private Double hdl;
	/**
	 * @description 低密度脂蛋白胆固醇
	 */
	private Double ldl;
	/**
	 * @description 葡萄糖
	 */
	private Double glu;
	/**
	 * @description 同型半膀胱氨酸
	 */
	private Double hcy;
	/**
	 * @description 微量白蛋白
	 */
	private Double m_alb;
	/**
	 * @description 微量白蛋白/尿肌酐
	 */
	private Double m_alb_crea;
	/**
	 * @description 用户id
	 */
	private User user;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(Integer id, String datetime, Double dp, Double sp, Double bmi, Double whr, Double ua, Double crea,
			Double tg, Double chol, Double bun, Double hdl, Double ldl, Double glu, Double hcy, Double m_alb,
			Double m_alb_crea, User user) {
		super();
		this.id = id;
		this.datetime = datetime;
		this.dp = dp;
		this.sp = sp;
		this.bmi = bmi;
		this.whr = whr;
		this.ua = ua;
		this.crea = crea;
		this.tg = tg;
		this.chol = chol;
		this.bun = bun;
		this.hdl = hdl;
		this.ldl = ldl;
		this.glu = glu;
		this.hcy = hcy;
		this.m_alb = m_alb;
		this.m_alb_crea = m_alb_crea;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public String getDatetime() {
		return datetime;
	}

	public Double getDp() {
		return dp;
	}

	public Double getSp() {
		return sp;
	}

	public Double getBmi() {
		return bmi;
	}

	public Double getWhr() {
		return whr;
	}

	public Double getUa() {
		return ua;
	}

	public Double getCrea() {
		return crea;
	}

	public Double getTg() {
		return tg;
	}

	public Double getChol() {
		return chol;
	}

	public Double getBun() {
		return bun;
	}

	public Double getHdl() {
		return hdl;
	}

	public Double getLdl() {
		return ldl;
	}

	public Double getGlu() {
		return glu;
	}

	public Double getHcy() {
		return hcy;
	}

	public Double getM_alb() {
		return m_alb;
	}

	public Double getM_alb_crea() {
		return m_alb_crea;
	}

	public User getUser() {
		return user;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public void setDp(Double dp) {
		this.dp = dp;
	}

	public void setSp(Double sp) {
		this.sp = sp;
	}

	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}

	public void setWhr(Double whr) {
		this.whr = whr;
	}

	public void setUa(Double ua) {
		this.ua = ua;
	}

	public void setCrea(Double crea) {
		this.crea = crea;
	}

	public void setTg(Double tg) {
		this.tg = tg;
	}

	public void setChol(Double chol) {
		this.chol = chol;
	}

	public void setBun(Double bun) {
		this.bun = bun;
	}

	public void setHdl(Double hdl) {
		this.hdl = hdl;
	}

	public void setLdl(Double ldl) {
		this.ldl = ldl;
	}

	public void setGlu(Double glu) {
		this.glu = glu;
	}

	public void setHcy(Double hcy) {
		this.hcy = hcy;
	}

	public void setM_alb(Double m_alb) {
		this.m_alb = m_alb;
	}

	public void setM_alb_crea(Double m_alb_crea) {
		this.m_alb_crea = m_alb_crea;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", datetime=" + datetime + ", dp=" + dp + ", sp=" + sp + ", bmi=" + bmi + ", whr="
				+ whr + ", ua=" + ua + ", crea=" + crea + ", tg=" + tg + ", chol=" + chol + ", bun=" + bun + ", hdl="
				+ hdl + ", ldl=" + ldl + ", glu=" + glu + ", hcy=" + hcy + ", m_alb=" + m_alb + ", m_alb_crea="
				+ m_alb_crea + ", user=" + user + "]";
	}
	
	
}
