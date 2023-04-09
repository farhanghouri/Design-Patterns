import java.io.IOException;

public class myMain {

	public static void main(String[] args) throws IOException {
		MyModel myModel = new MyModel();

		MyView myView = new MyView("v1");
		MyView myView2 = new MyView("v2");

		myModel.register(myView);
		myModel.register(myView2);

		myView.setSubject(myModel);
		myView2.setSubject(myModel);

		myModel.changeInFile("hello");
	}

}
