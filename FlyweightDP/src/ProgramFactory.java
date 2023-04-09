import java.util.EnumMap;
import java.util.Map;

public class ProgramFactory {
	private static Map<ProgramType, Program> programMap;
	
	static {
		programMap = new EnumMap<>(ProgramType.class);
	}
	
	private ProgramFactory() {
		
	}
	
	public static Program getProgram(ProgramType programType) {
		Program program = programMap.get(programType);
		if(program == null) {
			if(programType.equals(ProgramType.BASIC))
				program = new BasicProgram();
			else
				program = new AdvanceProgram();
			programMap.put(programType, program);
		}
		return program;
	}
}
