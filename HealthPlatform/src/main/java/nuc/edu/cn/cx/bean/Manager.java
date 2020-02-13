package nuc.edu.cn.cx.bean;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: Manager.java </p> 
 * @author chenx
 * @date 2020年2月10日
 * @description 后台管理员
 */
public class Manager {
	/**
	 * @description 管理员id
	 */
	private Integer id;
	
	/**
	 * @description 管理员工号
	 */
	private Integer job_number;
	
	
	/**
	 * @description 管理员密码
	 */
	private String pwd;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(Integer id, Integer job_number, String pwd) {
		super();
		this.id = id;
		this.job_number = job_number;
		this.pwd = pwd;
	}

	public Integer getId() {
		return id;
	}

	public Integer getJob_number() {
		return job_number;
	}

	public String getPwd() {
		return pwd;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setJob_number(Integer job_number) {
		this.job_number = job_number;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", job_number=" + job_number + ", pwd=" + pwd + "]";
	}
	
	
}
