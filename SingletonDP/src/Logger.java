import java.util.Date;

public class Logger {
	private static Logger logger;
	
	static {
		logger = new Logger();
	}
	
	public static Logger getLogger() {
		return logger;
	}
	
	public void log(String msg) {
		System.out.println(new Date() + " " + msg);
	}
}
