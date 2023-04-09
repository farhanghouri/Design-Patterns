import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyModel implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private Object Mutex = new Object();
	private boolean changed;

	@Override
	public void register(Observer observer) {
		synchronized (Mutex) {
			observers.add(observer);
		}
	}

	@Override
	public void unregister(Observer observer) {
		synchronized (Mutex) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyToObservers() {
		synchronized (Mutex) {
			if (!changed)
				return;
			for (Observer observer : observers)
				observer.update();
			changed = false;
		}
	}

	@Override
	public Object getState() {
		String line;
		StringBuilder stringBuilder = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader("db.txt"))) {
			while ((line = reader.readLine()) != null)
				stringBuilder.append(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringBuilder.toString();
	}

	public void changeInFile(String data) {
		try (FileWriter fr = new FileWriter("db.txt", true); BufferedWriter br = new BufferedWriter(fr);) {
			br.write(data + " ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		changed = true;
		notifyToObservers();
	}

}
