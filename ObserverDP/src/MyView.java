
public class MyView implements Observer {
	private Subject subject;
	private String name;

	public MyView(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println(name + ": " + subject.getState());
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
