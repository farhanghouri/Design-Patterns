import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlConverter implements Converter {

	@Override
	public void convert(Object object) {
		XmlMapper xmlMapper = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
		try {
			xmlMapper.writeValue(new File("result.xml"), object);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
