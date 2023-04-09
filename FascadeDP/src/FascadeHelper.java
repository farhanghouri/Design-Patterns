
public class FascadeHelper {
	private Converter jsonConverter, xmlConverter;

	public FascadeHelper() {
		jsonConverter = new JsonConverter();
		xmlConverter = new XmlConverter();
	}

	public void convert(Object object, Type type) {
		switch (type) {
		case JSON:
			jsonConverter.convert(object);
			break;
		case XML:
			xmlConverter.convert(object);
			break;
		}
	}
}
