
public class FactoryProducer {
	public static AbstractButtonFactory getFactory(boolean flag) {
		if(flag)
			return new MacButtonFactory();
		else return new WindowsButtonFactory(); 
	}
}
