package nuc.edu.cn.cx.util;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: Log.java </p> 
 * @author chenx
 * @date 2020年2月6日
 * @description 该接口提供了日志模块的规范。 日志模块将日志信息划分为五种级别，<br/>
 * 			 具体不同级别的日志的记录的格式、记录方式等内容有具体实现类来决定。
 */
public interface Log {
	/**
	 * 记录Debug级别的日志
	 * @param message 需要记录的日志信息
	 */
	public void debug(String message);
	/**
	 * 记录Info级别的日志
	 * @param message 需要记录的日志信息
	 */
	public void info(String message);
	/**
	 * 记录Warn级别的日志
	 * @param message 需要记录的日志信息
	 */
	public void warn(String message);
	/**
	 * 记录Error级别的日志
	 * @param message 需要记录的日志信息
	 */
	public void error(String message);
	/**
	 * 记录Fatal级别的日志
	 * @param message 需要记录的日志信息
	 */
	public void fatal(String message);
}
