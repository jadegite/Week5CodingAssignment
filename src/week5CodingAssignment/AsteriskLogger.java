package week5CodingAssignment;

public class AsteriskLogger implements Logger {
	
	String Ast = "***";

	@Override
	public void log(String log) {
//		Date date = new Date();

		System.out.println("LOG: "  + Ast + log + Ast );
		
	}

	@Override
	public void error(String error) {
		
		String word = "Error: "  + Ast + error + Ast;
		
		StringBuilder varAst = new StringBuilder();
		for (int i = 0; i <= word.length() ; i++) {
			varAst.append("*");
		}
		
		System.out.println(varAst);
		System.out.println("Error: "  + Ast + error + Ast );
		System.out.println(varAst);
		
	}

}
