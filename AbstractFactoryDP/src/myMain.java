
public class myMain {

	public static void main(String[] args) {
		 AbstractButtonFactory macButtonFactory = FactoryProducer.getFactory(true);
		 Button macButton = macButtonFactory.getButton();
		 macButton.onClick();
		 
		 AbstractButtonFactory windowsButtonFactory = FactoryProducer.getFactory(false);
		 Button windowsButton = windowsButtonFactory.getButton();
		 windowsButton.onClick();
	}

}
