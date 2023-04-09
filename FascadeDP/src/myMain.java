
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class myMain {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Student student = new Student("ahmed", 123);

		FascadeHelper fascadeHelper = new FascadeHelper();
		fascadeHelper.convert(student, Type.JSON);
		fascadeHelper.convert(student, Type.XML);
	}

}
