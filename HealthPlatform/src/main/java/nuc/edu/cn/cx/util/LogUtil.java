package nuc.edu.cn.cx.util;

import org.apache.log4j.Logger;

public class LogUtil implements Log{

	private static Logger logger = Logger.getLogger(LogUtil.class);
	
	public void debug(String message) {
		logger.debug(message);
		
	}

	public void info(String message) {
		logger.info(message);
		
	}

	public void warn(String message) {
		logger.warn(message);
		
	}

	public void error(String message) {
		logger.error(message);
		
	}

	public void fatal(String message) {
		logger.fatal(message);
		
	}

}
