
public class WindowsButton implements Button {
	private int width, height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public WindowsButton(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void onClick() {
		System.out.println("Windows Button Clicked!");
	}

}
