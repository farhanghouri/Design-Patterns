
public class myMain {

	public static void main(String[] args) {
		Program basicProgram = ProgramFactory.getProgram(ProgramType.BASIC);
		
		Student s1 = new Student();
		s1.setProgram(basicProgram);
		
		Program advanceProgram = ProgramFactory.getProgram(ProgramType.ADVANCE);

		Student s2 = new Student();
		s2.setProgram(advanceProgram);
	}

}
