package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		
		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		System.out.println("\n");
		logger.error("This is an error");
		
		System.out.println("\n");
		Logger logger2 = new SpacedLogger();
		logger2.log("Hello");
		System.out.println("\n");
		logger2.error("This is an error");

	}

}
