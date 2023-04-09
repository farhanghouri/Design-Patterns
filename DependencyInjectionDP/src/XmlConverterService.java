import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlConverterService implements ConverterService {

	@Override
	public void convertData(Object object) {
		XmlMapper xmlMapper = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
		try {
			xmlMapper.writeValue(new File("result.xml"), object);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
