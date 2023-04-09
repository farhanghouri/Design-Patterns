
public class myMain {

	public static void main(String[] args) {
		Student student = new Student("ahmed", 123);
		
		ConverterServiceInjector injector;
		Consumer consumer;
		
		// Convert student object into json
		injector = new JsonConverterServiceInjector();
		consumer = injector.getConsumer();
		consumer.processData(student);
		
		// Convert student object into xml
		injector = new XmlConverterServiceInjector();
		consumer = injector.getConsumer();
		consumer.processData(student);
	}

}
