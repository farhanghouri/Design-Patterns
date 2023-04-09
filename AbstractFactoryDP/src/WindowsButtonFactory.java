
public class WindowsButtonFactory extends AbstractButtonFactory {

	@Override
	public Button getButton() {
		return new WindowsButton(100, 100);
	}

}
