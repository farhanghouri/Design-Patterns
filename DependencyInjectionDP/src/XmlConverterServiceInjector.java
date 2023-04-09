//Injector classes that will initialize the services and then the consumer classes.
public class XmlConverterServiceInjector implements ConverterServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyApp(new XmlConverterService());
	}

}
