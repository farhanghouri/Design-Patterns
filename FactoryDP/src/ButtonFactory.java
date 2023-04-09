
public class ButtonFactory {
	public static Button getButton(String name) {
		if(name.equals("mac"))
			return new MacButton(100, 100);
		if(name.equals("windows"))
			return new WindowsButton(100, 100);
		return null;
	}
}
