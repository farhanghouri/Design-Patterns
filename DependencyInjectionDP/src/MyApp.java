
public class MyApp implements Consumer {
	private ConverterService converterService;
	
	public MyApp(ConverterService converterService) {
		this.converterService = converterService;
	}

	@Override
	public void processData(Object object) {
		converterService.convertData(object);
	}

}
