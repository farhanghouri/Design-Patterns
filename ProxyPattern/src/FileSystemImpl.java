import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSystemImpl implements FileSystem {
	private String fileName;

	public FileSystemImpl(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String read() {
		String line;
		StringBuilder stringBuilder = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			while ((line = reader.readLine()) != null)
				stringBuilder.append(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringBuilder.toString();
	}

	@Override
	public void write(String data) {
		try (FileWriter fr = new FileWriter(fileName, true); BufferedWriter br = new BufferedWriter(fr);) {
			br.write(data + " ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
