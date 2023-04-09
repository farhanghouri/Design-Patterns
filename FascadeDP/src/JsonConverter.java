import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter implements Converter {

	@Override
	public void convert(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("result.json"), object);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
