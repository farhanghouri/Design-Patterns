
public class myMain {

	public static void main(String[] args) {
		FileSystemProxy fs = new FileSystemProxy("file.txt");
		fs.write("abc");
		fs.read();
		fs.authentication("admin", "admin");
		fs.write("abc");
	}

}
