
public class MacButtonFactory extends AbstractButtonFactory {

	@Override
	public Button getButton() {
		return new MacButton(100, 100);
	}

}
