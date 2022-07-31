package week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			word.append(log.charAt(i));
			word.append(" ");
		}
		System.out.println("Log: " + word);
	}

	@Override
	public void error(String error) {
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			word.append(error.charAt(i));
			word.append(" ");
		}
		System.out.println("ERRROR: " + word);
		
	}

}
