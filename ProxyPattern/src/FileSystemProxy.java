
public class FileSystemProxy implements FileSystem {
	private boolean flag;
	private FileSystem fs;

	public FileSystemProxy(String fileName) {
		fs = new FileSystemImpl(fileName);
	}

	public void authentication(String name, String passw) {
		if (name.equals("admin") && passw.equals("admin"))
			flag = true;
	}

	@Override
	public String read() {
		return fs.read();
	}

	@Override
	public void write(String data) {
		if (!flag)
			System.out.println("Access Denied!");
		else {
			fs.write(data);
		}
	}

}
