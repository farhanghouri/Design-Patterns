
public class myMain {

	public static void main(String[] args) {
		Button macButton = ButtonFactory.getButton("mac");
		if (macButton != null)
			macButton.onClick();

		Button windowsButton = ButtonFactory.getButton("windows");
		if (windowsButton != null)
			windowsButton.onClick();
	}

}
